package programs;


import java.util.Scanner;
public class Armstorng {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(Armstrong(n));

//        print all armstorng number between a range
        for(int i=100;i<1000;i++){
            if(Armstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean Armstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+ rem*rem*rem;

        }
        return sum==original;  /*checks if a number is boolean*/
    }
}
