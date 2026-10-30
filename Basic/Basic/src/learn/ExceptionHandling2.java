package learn;

class SarthakException extends Exception{
    public SarthakException(String str){
            super(str);
    }
}

public class ExceptionHandling2 {
    public static void main(String[] args) {

        int i=20;
        int j=1;// change it to 0 to make 1st try run
        int[] nums=new int[0];

        try{
            j=20/i;
            if(j==0){         //USED THROW
                throw new ArithmeticException("THIS IS WORNG");
            }

            int res=nums.length;
            if(res==0){
                throw new SarthakException("My idea of exception");
            }

        }
        catch (ArithmeticException e){
            j=18/1;
            System.out.println("this is default output"+ e);   //HERE E WILL THROW COMPILER MSG AND THROW MSG OF THIS IS WRONG
        }

        catch (SarthakException s){
            System.out.println("something is wrong" + s);
        }
        System.out.println(j);
    }
}
