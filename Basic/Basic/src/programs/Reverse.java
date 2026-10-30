package programs;


import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number:");
        int dig= in.nextInt();
        int res=0;

        while(dig>0){
            int rev= dig%10;
            dig=dig/10;
            res=(res*10) +rev;

        }
        System.out.println("Reverse is : "+ res);

    }
}
