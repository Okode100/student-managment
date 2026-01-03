package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;



public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public  void registerStudent(Student student){
        students.add(student);
    }

    public  List<Student> getAllStudents(){
        return students;

    }
    public void findStudentById(int id){
        return Student.filter(student -> student !=null && student.equals(id))
    }
}

