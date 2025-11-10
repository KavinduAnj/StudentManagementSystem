import java.util.*;
public class StudentService {
    private List<Student> students;

    public StudentService() {
        students = FileHandler.loadStudents(); // Load existing data
    }

    private int generateId() {
        return students.isEmpty() ? 1 : students.get(students.size() - 1).getId() + 1;
    }

}
