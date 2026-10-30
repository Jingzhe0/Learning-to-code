package learn;

class Human{
    private String name="sarthak";
    private int age=23;

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

public class BasicOops3 {
    public static void main(String[] args) {
        Human obj =new Human();

        obj.setAge(18);
      //  obj.setName("Vaasu");

        System.out.println(obj.getName()+ " : " + obj.getAge());
    }
}
