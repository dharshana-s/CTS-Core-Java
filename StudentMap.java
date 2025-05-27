import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            if (id == -1) break;

            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("\nEnter a student ID to retrieve their name: ");
        int searchId = scanner.nextInt();
        System.out.println("Student name: " + studentMap.getOrDefault(searchId, "Not Found"));

        scanner.close();
    }
}