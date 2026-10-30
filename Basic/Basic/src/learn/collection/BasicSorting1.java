package learn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasicSorting1 {
    public static void main(String[] args) {

        List<Integer> nums1= new ArrayList<Integer>();
        nums1.add(54);
        nums1.add(48);
        nums1.add(64);
        nums1.add(64);
        Collections.sort(nums1) ; //only works in list
        System.out.println(nums1);

        //TO SORT USING YOUR OWN LOGIC
        //HERE WE SORT ON THE BASIS OF UNITS DIGIT
        Comparator<Integer> com= new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<Integer> nums= new ArrayList<Integer>();
        nums.add(57);
        nums.add(48);
        nums.add(63);
        nums.add(60);

        Collections.sort(nums,com) ; //only works in list
        System.out.println(nums);
    }
}

