package view;

import model.Student;

import java.util.List;

public class ConsoleView {

    public void showStudentCreated(String student) {
        Student stud = new Student();
        System.out.println("Student registered successfully:");
        System.out.println(
                "ID: " + stud.getId() +
                        ", Name: " + stud.getName() +
                        ", Age: " + stud.getAge() +
                        ", Email: " + stud.getEmail()
        );
    }

    public void showAllStudents(List<Student> students) {
        System.out.println("\nAll Registered Students:");
        for (Student student : students) {
            System.out.println(
                    student.getId() + " | " +
                            student.getName() + " | " +
                            student.getAge() + " | " +
                            student.getEmail()
            );
        }
    }
}
