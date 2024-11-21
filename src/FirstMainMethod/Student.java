package FirstMainMethod;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Student {
    int studentId;
    String name;
    String dob;
    String gender;
    String email;
    String grade;

    static int abc = 100;

    public void demo() {
        System.out.println("demo non-static method");
    }
    public static void demo2(){
        System.out.println("demo2 static method");
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Student (int studentId, String name, String dob, String gender, String email, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.grade = grade;
    }

    public Student() {

    }
}
