package util;

import model.Student;
import service.StudentService;



public class StudentController {
    //initialize the studentService object
    private final StudentService service = new StudentService();
    public Student createStudent(String name, int age, int id, String email ){
        //initialize the Studnet class
        Student student = new Student(name, age, id, email);
        service.registerStudent(student);

        return student;
    }



}
