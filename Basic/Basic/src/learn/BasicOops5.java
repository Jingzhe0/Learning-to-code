package learn;// STATIC VARIABLES ARE THOSE WHO CARRY SAME VALUE IN DIFFERENT OBJECTS
// LIKE IN THIS EXAMPLE WE USE STATIC NAME, AND THEN CHANGE IT TO PHONE FOR 1 OBJ, BUT IT CHANGES FOR ALL OBJ
// STATIC VARIABLES SHOULD BE CALLED BY CLASS NAME RATHER THAN OBJ NAME

//for  STATIC METHOD , WE HAVE TO PASSA OBJ REFERENCE IN THE METHOD,
// ALSO STATIC METHOD CANNOT CALL NON STATIC VARIABLES
class Mobile{

    //instance variable//

    static String name;
    int price;
    String brand;

    public void show(){
        System.out.println(brand+" : "+ price+ " : "+name);
    }

    public static void show1(Mobile obj){
        System.out.println(name+ " : "+ obj.price+" : "+ obj.brand); //no need for obj reference for static variable name//
    }
}


public class BasicOops5 {
    public static void main(String[] args) {
        Mobile obj1= new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="Smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1200;
        Mobile.name="Smartphone";

        Mobile obj3=new Mobile();
        obj3.brand="Vivo";
        obj3.price=1800;
        obj3.name="Smartphone";

        Mobile.name="Phone";

        obj1.show();     //calling static variable
        obj2.show();
        obj3.show();

        System.out.println();
        Mobile.show1(obj2);   //callinf static method
    }



}
