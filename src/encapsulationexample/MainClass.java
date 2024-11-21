package encapsulationexample;

//import FirstMainMethod.Student;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentId(123);
        student1.setName("sam");
        student1.setDob("12/08/24");
        student1.setGender("male");
        student1.setEmail("sam123@gmail.com");
        student1.setGrade("4th");

        System.out.println("student id :"+ student1);

        System.out.println("student id :"+ student1.getEmail());
    }
}
