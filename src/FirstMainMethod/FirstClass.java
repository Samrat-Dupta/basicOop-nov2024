package FirstMainMethod;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Welcome");

        Student s1 = new Student(); // Default Constructor
        System.out.println("s1 is :" + s1);

        s1.studentId = 123;
        s1.name = "Samrat";
        s1.dob = "12/23/2222";
        s1.gender = "male";
        s1.email = "xyz123@gmail.com";
        s1.grade = "8th A section";

        System.out.println("s1 is : " + s1);

        Student student2 = new Student(123, "vijay", "12-04-2024","male" , "vijay123@gmail.com", "5th"); //It is a parameterized constructor
        System.out.println("student2 with parameterized constructor is :" + student2);


        Student stu1 = new Student();
        stu1.demo();

        Student.demo2();
        System.out.println("abc value is : " + Student.abc);
    }
}
