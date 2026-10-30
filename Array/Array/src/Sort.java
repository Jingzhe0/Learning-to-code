import java.util.Arrays;

import static java.util.Arrays.*;

public class Sort {
    public static void main(String[] args) {
        int[] arr= {12,34,1,56,5,19,3};
        int[] temp= arr;
        Arrays.sort(temp);

        System.out.println(Arrays.toString(temp));
    }
}
