package learn.collection;


import java.sql.SQLOutput;
import java.util.*;

public class Basic {
    public static void main(String[] args) {

        //COLLECTION IS A OBJECT
        Collection<Integer> nums= new ArrayList<Integer>();
        nums.add(5);
        nums.add(4);
        nums.add(64);

        for(Object i:nums){
           // System.out.println(i);
        }

        List<Integer> nums1= new ArrayList<Integer>();
        nums1.add(54);
        nums1.add(48);
        nums1.add(64);
        nums1.add(64);
        Collections.sort(nums1) ; //only works in list
        System.out.println(nums1);

        for(int i:nums1){
           // System.out.println(i);
        }


        //GIVES UNIQUE VALUES
        Set<Integer> nums2= new HashSet<Integer>();
        nums2.add(54);
        nums2.add(64);
        nums2.add(48);
        nums2.add(64);


        for(int i:nums2){
           // System.out.println(i);
        }

        //GIVES UNIQUE AND SORTED VALUES
        Set<Integer> nums3= new TreeSet<Integer>();
        nums3.add(54);
        nums3.add(64);
        nums3.add(48);
        nums3.add(64);

        for(int i:nums3){
           // System.out.println(i);
        }

    }
}
