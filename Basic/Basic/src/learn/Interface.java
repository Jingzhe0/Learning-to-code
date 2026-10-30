package learn;

//INTERFACE MEANS IT GIVES US THE DESIGN BUT NOT IMPLEMENTATION AND IT IS DIFFERENT FROM CLASS

//GIVING THE DESIGN BELOW
interface A{ //INTERFACE MEANS PUBLIC STATIC is alrrady written

    String name="Ravi";    //ALL VARIABLES IN INTERFACE ARE FINAL AND STATIC
    int age= 52;

    void show();     // ALL METHODS IN INTERFACE ARE PUBLIC AND STATIC
    void config();
}

class B implements A{
    public void show(){
        System.out.println("in B show");
    }
    public void config(){
        System.out.println("in config");
    }
}


public class Interface {
    public static void main(String[] args) {

        A obj;
        obj= new B();

        obj.show();
        obj.config();

        System.out.println(A.name);
    }
}
