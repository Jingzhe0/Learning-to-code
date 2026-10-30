import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);


//        initialize an array

        int[] arr= new int[5];
//        datatype[] name of array = new datatype[sizee]

//        int[] arr2= {10,50,42,62};
//        datatype name = {values}

//        System.out.println(arr2);

//        to print an whole array
//        System.out.println(Arrays.toString(arr2));

        for(int i=0; i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        System.out.print(Arrays.toString(arr));
    }
}
