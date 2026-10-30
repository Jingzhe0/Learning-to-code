
import java.util.Arrays;
import java.util.Scanner;

public class Tcsrotated {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String line= sc.nextLine();
        String[] words= line.split(",");
        int[] nums= new int[words.length];
        for(int i=0;i<words.length;i++){
            nums[i]=Integer.parseInt(words[i]);
        }

//        int [] nums= {1,2,3,7};

        int n = nums.length;

        int k= nums[n-1];

        int[] arr = Arrays.copyOf(nums, n - 1);

        int size= n-1;

        k = k % size;



        reverse(arr, 0, size-1);

        reverse(arr, 0, k - 1);

        reverse(arr, k, size - 1);

//        for (int i = 0; i < size; i++) {
//            System.out.print(nums[i]);
//            if (i != size - 1) System.out.print(",");
//        }


        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
