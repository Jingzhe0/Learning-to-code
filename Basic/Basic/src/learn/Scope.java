package learn;

public class Scope {
    static int a=50;
    public static void main(String[] args) {
        int b=4;
        System.out.println(b);
        System.out.println(a);
        {
            int a=45;
            System.out.println(a);
        }
        {
            b=10;
        }
        System.out.println(b);
        System.out.println(a);
    }


}
