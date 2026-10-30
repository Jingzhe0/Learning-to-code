package learn;

public class ExceptionHandling {
    public static void main(String[] args) {

        int i=0;
        int j=2;
        String str=null;
        int[] nums=new int[5];

        //critical statements

        try{
            j=18/i;           //error as when i=0
            System.out.println(str.length());    //error as null string has no length
            System.out.println(nums[0]);        //works as empty array has 0 values as default
            System.out.println(nums[5]);       //error has index out of bounds
        }
        //DIFFERENT CATCH BLOCKS FOR SPECIFIC TYPE OF EXCEPTIONS AND MODIFIED HANDLING
        catch(ArithmeticException e){        //
            System.out.println("Cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Check length of array");
        }
        //COMMOM OUTPUT IF SOME NEW TYPE OF ERROR OCCURS
        catch(Exception e){
            System.out.println("something went wrong: "+ e);
        }
    }    //ALSO THE SYSTEM WILL CHECK THE 1ST ERROR OF TRY STATEMNT AND THEN EXIT WITHOUT CHECKING OTHERS
}
