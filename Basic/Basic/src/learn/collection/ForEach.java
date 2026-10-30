package learn.collection;

//FORREACH AND STREAM
//STREAM IS USED WHEN U WANT TO DO SOME OPERATION ON DATA WHILE KEEPING ORIGINAL DATA
//STREAM CAN CAN BE USED ONLY ONCE

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {

//        List<Integer> nums= Arrays.asList(45,62,8,17,35);
//
//        Stream<Integer> s1= nums.stream();
//
//        //we can use a stream by using another stream
//        Stream<Integer> s2= s1.map(n->n*2);
//
//        s2.forEach(n-> System.out.println(n));
//        System.out.println();
//        nums.forEach(n-> System.out.println(n));
//        System.out.println();
//        nums.forEach(n-> System.out.println(n*2));

        //BEST EXAMPLE OF SUCCESSIVE USAGE OF STREAM~

        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Stream<Integer> result= num.stream()
                .filter(n->n%2==0)
                .map(n -> n*2);

        result.forEach(n-> System.out.println(n));

        //OR IF WE USE REDUCE IN END WE CAN USE WITHOUT FOREACH

        System.out.println();
        List<Integer> num1= Arrays.asList(1,2,3,4,5,6,7,8,9);

        int result1= num.stream()
                .filter(n->n%2==0)
                .map(n -> n*2)
                .reduce(0,(a,b)->a+b);

        System.out.println(result1);


    }
}
