package learn;

//ANONYMOUS INNER CLASS
// THIS OVERRIDES CLASS METHODS AND USE THE METHOD IMPLEMENTATION DEFINED AFTER IT

// 1ST WAY TO DO

//class Aa{
//    public void show(){
//        System.out.println("in a show");
//    }
//}
//
//class Bb extends Aa{
//    public void show(){
//        System.out.println("in b show");
//    }
//}
//
//public class Anonymous {
//    public static void main(String[] args) {
//        Aa obj= new Bb()
//        {
//            public void show() {              //OVERRIDING THE OLD METHOD
//                System.out.println("in new show");
//            }
//        };
//        obj.show();
//    }
//}




// 2ND WAY TO DO

//use in abstract class so that we dont have to make a new class to extend it just for implementing once

abstract class Aa{
    public abstract void show();
}

public class Anonymous {
    public static void main(String[] args) {
        Aa obj= new Aa()
        {
            public void show() {              //OVERRIDING THE OLD METHOD
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
