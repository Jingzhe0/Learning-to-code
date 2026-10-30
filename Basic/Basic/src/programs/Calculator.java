package programs;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter operator:");
        char op = in.next().trim().charAt(0);
        int res = 0;
        while (true) {
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
                System.out.print("Enter two numbers:");
                int a = in.nextInt();
                int b = in.nextInt();

                if (op == '+') {
                    res = a + b;
                }
                if (op == '-') {
                    res = a - b;
                }
                if (op == '*') {
                    res = a * b;
                }
                System.out.println(res);
                break;

            }


        }
    }
}
