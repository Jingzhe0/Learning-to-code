import java.util.Arrays;
import java.util.Scanner;

public class TCSinput {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String line= sc.nextLine();
        String[] words= line.split(" ");
        int[] arr= new int[words.length];
        for(int i=0;i<words.length;i++){
            arr[i]=Integer.parseInt(words[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
