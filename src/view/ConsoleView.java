package view;

import model.Student;

import java.util.List;

public class ConsoleView {

    public void showStudentCreated(String student) {
        System.out.println("Student registered successfully:");
        System.out.println(
                "ID: " + student.getId() +
                        ", Name: " + student.getName() +
                        ", Age: " + student.getAge() +
                        ", Email: " + student.getEmail()
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
