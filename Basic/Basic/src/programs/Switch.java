package programs;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        String fruit= in.next();

//        switch (fruit){
//            case "mango" :{
//                System.out.println("king of fruit");
//                break;
//            }
//            case "apple" :{
//                System.out.println("sweet and red");
//                break;
//
//            }
//            case "oranges" :{
//                System.out.println("round fruit");
//                break;
//
//            }
//            default:{
//                System.out.println("Enter valid");
//            }
//        }
//        switch (fruit) {
//           case "mango" -> System.out.println("kiinf of fruit");
//           case "apple" -> System.out.println("sweet red");
//           default -> System.out.println("inavlid");
//        }

        int day= in.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesay");
            case 3 -> System.out.println("Wednesday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            case 4 -> System.out.println("Thursday");
        }

        switch (day){
            case 1,2,3,4 -> System.out.println("Weekday");
            case 5,6,7 -> System.out.println("Weekend");

        }
    }
}
