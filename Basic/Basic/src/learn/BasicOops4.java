package learn;

class Human1{
    private String name;
    private int age;


    public Human1(){       //DEFAULT CONSTRUCTOR //
        name="sarthak";
        age=25;
    }

    public Human1(int a, String n){       //PARAMTERIZED CONSTRUCTOR //
        age=a;
        name=n;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void  setName(String a){
        name= a;
    }

    public void setAge(int a){
        age= a;
    }
}

public class BasicOops4 {
    public static void main(String[] args) {
        Human1 obj =new Human1();
        //the next line print default values of a constructor
        System.out.println(obj.getName()+ " : " + obj.getAge());

        //the next line print parametrized values of a constructor
        Human1 obj1 =new Human1(56,"ravi");
       System.out.println(obj1.getName()+ " : "+ obj1.getAge());

        obj.setAge(18);
        obj.setName("Vaasu");

        //System.out.println(obj.getName()+ " : " + obj.getAge());
    }
}
