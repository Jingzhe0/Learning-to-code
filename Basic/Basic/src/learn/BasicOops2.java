package learn;

class Student{
    String name;
    int marks;
    int rollno;
}

public class BasicOops2 {
    public static void main(String[] args) {

        Student s1 =new Student();
        s1.name="Sarthak";
        s1.marks=54;
        s1.rollno=3;

        Student s2 =new Student();
        s2.name="Aditya";
        s2.marks=40;
        s2.rollno=1;

        Student s3 =new Student();
        s3.name="Bhavya";
        s3.marks=78;
        s3.rollno=2;

        Student student[] =new Student [3];  //this is an array student from datatype STUDENT , not a object //
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        for(Student stud: student){   //enhanced for loop; Student is a datatype (class from top one); stud is a variable; student is the array to iterate //
            System.out.println(stud.rollno+ ":"+ stud.name+ "-"+ stud.marks);
        }

//        for(int i=0;i< student.length;i++){
//            System.out.println(student[i].name + " "+ student[i].rollno + " "+ student[i].marks);
//        }
//        System.out.println(s1.name + " "+ s1.rollno);

        int nums[]= new int[4];
        nums[0]=54;
        nums[1]=41;
        nums[2]=63;
        nums[3]=85;

        for(int n : nums){         //enhanched for loop //
            System.out.println(n);
        }
    }
}
