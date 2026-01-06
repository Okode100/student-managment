package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public boolean registerStudent(Student student) {

        if (findStudentById(student.getId()) != null) {
            return false;
        }

        students.add(student);
        return true;
    }

    public Student findStudentById(int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
