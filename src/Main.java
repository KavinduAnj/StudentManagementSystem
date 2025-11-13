// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> service.addStudent(sc);
                case 2 -> service.viewStudents();
                case 3 -> service.searchStudent(sc);
                case 4 -> service.updateStudent(sc);
                case 5 -> service.deleteStudent(sc);
                case 6 -> System.out.println("👋 Goodbye!");
                default -> System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 6);
    }
}
