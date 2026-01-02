package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;


public class studentService {
    private final List<Student> students = new ArrayList<>();

    public  void registerStudent(Student student){
        students.add(student);
    }

    public  List<Student> getAllStudent(){
        return students;

    }
}

