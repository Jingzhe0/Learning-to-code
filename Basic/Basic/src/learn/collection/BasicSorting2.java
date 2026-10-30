package learn.collection;

import java.util.*;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String toString() {
        return  "name='" + name + '\'' + ", age=" + age ;
    }
}


    public class BasicSorting2 {
    public static void main(String[] args) {
        Comparator<Student> com= new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if(i.age>j.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<Student> stud=new ArrayList<>();
        stud.add(new Student("Sarthak",24));
        stud.add(new Student("Archit",22));
        stud.add(new Student("Rig",14));
        stud.add(new Student("Bhavya",20));

        Collections.sort(stud,com);

        for(Student s: stud)
                System.out.println(s);



    }
}
