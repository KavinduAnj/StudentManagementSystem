import java.util.*;

public class StudentService {
    private List<Student> students;

    public StudentService() {
        students = FileHandler.loadStudents();
    }

    private int generateId() {
        return students.isEmpty() ? 1 : students.get(students.size() - 1).getId() + 1;
    }

    public void addStudent(Scanner sc) {
        System.out.print("Enter name: ");
        sc.nextLine(); // consume newline
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

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\nID | Name | Age | Course | Marks");
        System.out.println("----------------------------------------");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent(Scanner sc) {
        System.out.print("Enter student ID to search: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student found: " + s);
                return;
            }
        }
        System.out.println("❌ Student not found!");
    }

    public void updateStudent(Scanner sc) {
        System.out.print("Enter student ID to update: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                sc.nextLine();
                System.out.print("Enter new name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new age: ");
                s.setAge(sc.nextInt());
                sc.nextLine();
                System.out.print("Enter new course: ");
                s.setCourse(sc.nextLine());
                System.out.print("Enter new marks: ");
                s.setMarks(sc.nextDouble());
                FileHandler.saveStudents(students);
                System.out.println("✅ Student updated successfully!");
                return;
            }
        }
        System.out.println("❌ Student not found!");
    }

    public void deleteStudent(Scanner sc) {
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId() == id) {
                iterator.remove();
                FileHandler.saveStudents(students);
                System.out.println("🗑️ Student deleted successfully!");
                return;
            }
        }
        System.out.println("❌ Student not found!");
    }
}
