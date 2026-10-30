package learn;

//LAMBDA EXPRESSION WORKS ONLY WITH FUNCTIONAL INTERFACE
// FUNCTIONAL INTERFACE IS WHEN A INTERFACE ONLY HAS 1 METHOD

@FunctionalInterface
interface Aaa{
     void show();
}

// PARAMETER INTERFACE
@FunctionalInterface
interface Baa{
    void row(int i);
}

// TWO INPUTS
@FunctionalInterface
interface Ccc{
    int add(int a,int b);
}

public class Lambda {
    public static void main(String[] args) {

        //INSTEAD OF WRITING THIS WHOLE NEW Aaa public void show we only wrote the implementation

//        Aaa obj=new Aaa(){
//            public void show(){
//                System.out.println("in wshow");
//            }
//        };

        // THIS IS LAMBDA EXPRESSION

        Aaa obj=()-> System.out.println("in show");

        Baa obj1= i -> System.out.println("in b: " + i);


        //WITHOUT LAMBDA EXPRESS

//        Ccc obj2=new Ccc() {
//            public int add(int a, int b) {
//                return a+b;
//            }


        //WITH LAMBDA EXPRESS
        Ccc obj2=(i,j)->i+j;

        obj.show();
        obj1.row(3);

        int res=obj2.add(5,2);
        System.out.println(res);
    }
}
