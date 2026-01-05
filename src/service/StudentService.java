package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;



public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public  List<Student> getAllStudents(){
        return students;

    }
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public String registerStudent(Student student){
        if(findStudentById(student.getId()) != null){
            return "Student already exist";
        }
        students.add(student);
        return "Studnet registered succefuly";
    }

}

