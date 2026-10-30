package learn.collection;

//BASIC STREAM DONE IN FOREACH FILE

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {
    public static void main(String[] args) {
        int size=10_000;
        List<Integer> nums= new ArrayList<>(size);

        //CREATE RANDOM VALUES
        Random ran= new Random();

        for(int i=1;i<=size;i++){
            nums.add(ran.nextInt(100));   //100 reperesents upper bound of random value it can create, ie no value more than 100

        }

        //NORMAL STREAM
        int sum1=nums.stream()
                .map(i-> i*2)
                .reduce(0,(a,b)->a+b);

        //ADDING TIMESTAMP SO THAT WE CAN COUNT WHETHER SEQUENTIAL STREAM SUNS FAST OR PARALLEL THREAD
        long startseq=System.currentTimeMillis();

        //STREAM USING MAPTOINT SO WE DONT HAVE TO USE REDUCE
        int sum2=nums.stream()
                .map(i-> i*2)
                .mapToInt(i->i)
                .sum();
        //TIMESTAMP END FOR SEQUENCE
        long endseq=System.currentTimeMillis();


        //TIMESTAMP START FOR PARALLEL THREAD
        long startpara=System.currentTimeMillis();

        int sum3=nums.parallelStream()
                .map(i-> i*2)
                .mapToInt(i->i)
                .sum();

        //TIMESTAMP END FOR PARALLEL THREAD
        long endpara=System.currentTimeMillis();


//THESE VALUES WILL BE DIFFERENT AFTER EACH RUN AS THE VALUES GENERATED ARE
// RANDOM BUT SUM1 AND SUM2 AND SUM3 SHOULD BE EQUAL EACH TIME
        System.out.println("Sum1 : "+ sum1+ "  " + "Sum2 : "+ sum2+ "  " + "Sum3 : "+ sum3 );
        System.out.println("sum2 SEQ : " +(endseq-startseq));
        System.out.println("sum3 PARA : " +(endpara-startpara));

        //IF SEQUENCENCE IS MORE THAN PARALLEL MEANS THE SYSTEM IS FAST
        // AND CREATES THREAD FASTER THAN NORMAL CALCULATION I.E LIKE MACBOOK AND THIS PC
    }
}
