package learn;

abstract class Car{
    public abstract void drive();    //ABSTRACT METHOD CAN ONLY BE DEFINED IN A ABSRACT CLASS

    public void playMusic(){
        System.out.println("Playing music...");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("driving");
    }
}


public class Abstract {
    public static void main(String[] args) {

       // Car obj1= new Car();//  CANNOT CREATE A METHOD OF ABSTRACT CLASS
        Car obj= new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
