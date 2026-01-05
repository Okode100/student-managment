package controller;

import model.Student;
import service.StudentService;

import java.util.List;

public class StudentController {

    private final StudentService service = new StudentService();

    public String createStudent(String name, int age, int id, String email) {
        Student student = new Student(id, name, age, email);
        return service.registerStudent(student);
    }

    public Student getStudentById(int id) {
        return service.findStudentById(id);
    }

    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
}
