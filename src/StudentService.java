import java.util.*;
public class StudentService {
    private List<Student> students;

    public StudentService() {
        students = FileHandler.loadStudents(); // Load existing data
    }

    private int generateId() {
        return students.isEmpty() ? 1 : students.get(students.size() - 1).getId() + 1;
    }

    public void addStudent(Scanner sc){
        System.out.print("Enter name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter course: ");
        sc.nextLine();
        String course = sc.nextLine();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(generateId(), name, age, course, marks);
        students.add(s);
        FileHandler.saveStudents(students);
        System.out.println("✅ Student added successfully!");
    }

}
