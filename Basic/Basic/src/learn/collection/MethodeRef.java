package learn.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//MEANS METHOD REFERENCE
//HERE WE CAN USE A METHOD INSIDE A METHOD BY USING ::
// EX. nums.forEach(System.out::print());
class Student1{
    private String name;
    private int age;

    //default constructor
    public Student1(){
    }

    //PARAMTERIZED CONSTRUCTOR FOR NAME SO THAT A STUDENT HAS NAME
    public Student1(String name) {
        this.name = name;
    }

    //tostring
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //GETTER

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class MethodeRef {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ravi","Kishan","Monu");

        List<Student1> students= new ArrayList<>();

        //DEFAULT WAY
//        for(String name: names){
//            students.add(new Student1(name));
//        }



        //USING STREAM
//        students= names.stream()
//                .map(name-> new Student1(name))
//                .toList();



        //USING constructor reference or method reference
        students= names.stream()
                .map(Student1::new)
                .toList();

        System.out.println(students);
    }
}
