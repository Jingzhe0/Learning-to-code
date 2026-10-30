package learn;

//class Calculator1{
//    int a;
//
//    public int add(){
//        System.out.println("in add");
//        return 0;
//    }
//
//}

//public class BasicOops {
//    public static void main(String[] args) {
//        int x= 5;
//        int y=3;
//
//        Calculator1 calc= new Calculator1();
//        int result= calc.add();;
//        System.out.println(result);
//
//
//
//
//    }
//
//}


// ABOVE IS ONE FULL PROGRAM INCLUDING MAIN

class Computer{
    public void playmusic(){
        System.out.println("Music playing...");
    }

    public String getPen(int cost){
        if (cost>=8)
            return "Pen";
        return "nothing";
    }
}

public class BasicOops{
    public static void main(String[] args){

        Computer obj= new Computer();
        obj.playmusic();
        String str= obj.getPen(5);
        System.out.println(str);
        System.out.println(obj.getPen(15));
    }
}