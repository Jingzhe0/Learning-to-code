package programs;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        System.out.println("Enter the temperature in C: ");
        float res= (x.nextFloat()*9/5)+32;
        System.out.println("temp in F:" +res);
    }
}
