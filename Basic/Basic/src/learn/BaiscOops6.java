package learn;


class Calc2{
    public int add(int r1,int r2){
        return r1+r2;
    }
    public int sub(int r1,int r2){
        return r1-r2;
    }
}

class AdvCalc extends Calc2{
    public int mult(int r1,int r2){
        return r1*r2;
    }
    public int div(int r1,int r2){
        return r1/r2;
    }
}


public class BaiscOops6 {
    public static void main(String[] args) {
        Calc2 obj= new Calc2();
        System.out.println(obj.add(5,4));

        AdvCalc obj1= new AdvCalc();
        int r= obj1.mult(5,4);
        int x=obj1.sub(18,5);     //calls methods of calc2 class
        System.out.println(r+ ":" + x);

    }
}
