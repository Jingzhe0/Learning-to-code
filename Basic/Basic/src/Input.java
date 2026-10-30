
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner a = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name= a.next();
        System.out.println("Your name is:"+name);
    }
}
