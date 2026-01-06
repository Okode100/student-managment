package controller;

import model.Student;
import service.StudentService;

import java.util.List;

public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    public Student createStudent(String name, int age, int id, String email) {

        if (!isValidAge(age)) {
            System.out.println("Invalid age");
            return null;
        }

        if (!isValidEmail(email)) {
            System.out.println("Invalid email");
            return null;
        }

        Student student = new Student(id, name, age, email);

        boolean saved = service.registerStudent(student);

        if (!saved) {
            System.out.println("Student with ID already exists");
            return null;
        }

        return student;
    }

    public Student findStudentById(int id) {
        return service.findStudentById(id);
    }

    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // ===== Validation =====

    private boolean isValidAge(int age) {
        return age > 0;
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}
