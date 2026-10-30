package programs;

import java.util.Scanner;
public class NumOccurence {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =in.nextInt();
        System.out.print("Which number ccurence to find?:");
        int dig= in.nextInt();
        int count=0;
        while(num>0){
            int rem= num % 10;
            if(rem==dig){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
