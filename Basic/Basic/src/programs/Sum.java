package programs;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.print("ENter nos:");
        int a= x.nextInt();
        int b=x.nextInt();

        int sum=a+b;

        float c= x.nextFloat();
        float d=x.nextFloat();

        float sum1 =c+d;


        System.out.println("sum is: "+ sum1);
    }
}
