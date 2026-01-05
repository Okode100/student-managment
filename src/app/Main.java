package app;

import controller.StudentController;
import model.Student;
import view.ConsoleView;
import service.StudentService;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentController controller = new StudentController();
        ConsoleView view = new ConsoleView();
        StudentService service = new StudentService();

        String student1 = controller.createStudent(
                "Moses okode", 22, 22, "moses@mail.com"
        );

        String student2 = controller.createStudent(
                "James okode", 22, 24, "moses@mail.com"
        );

        view.showStudentCreated(student1);
        view.showStudentCreated(student2);

        List<Student> allStudents = service.getAllStudents();
        view.showAllStudents(allStudents);
    }
}
