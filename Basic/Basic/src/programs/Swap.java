package programs;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter two numbers to swap:");
        int a=in.nextInt();
        int b=in.nextInt();
        swap(a,b);
//        System.out.println(a+b);

    }

    public static void swap(int x, int y){
        int temp=x;
        x=y;
        y=temp;
//        return new int[]{x,y};
        System.out.println("swapped numbers are:" + x+ " "+ y);
//        System.out.println( x+ y);


    }

}
