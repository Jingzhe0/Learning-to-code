package learn.collection;

import javax.swing.plaf.synth.SynthTableUI;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class BasicMaps {
    public static void main(String[] args) {

        //MAP<KEY,VALUE> OBJECT= NEW HASHMAP

        //HashTable IS SAME AS HASHMAP BUT IT IS SYNCHRONIZED I.E THREAD SAFE
        Map<String,Integer> students= new HashMap<>();
        students.put("Sarthak",54); //insert key
        students.put("Aditya",024);
        students.put("Bhavya",98);
        students.put("Sushant",80);
        students.put("Aditya",45);   //UPDATES THE OLD VALUE

        System.out.println(students); //ALL STUDENTS
        System.out.println(students.get("Sarthak"));  //GET VALUE ,,CASE SENSITIVE
        System.out.println(students.keySet());
        System.out.println(students.values());


        //TO PRINT KEYS IN ONE LINE
        for(String key: students.keySet()){
              System.out.println(key+ " : "+ students.get(key));
        }

    }
}
