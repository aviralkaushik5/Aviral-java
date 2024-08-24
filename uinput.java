import java.util.Scanner;  // Import the Scanner class

public class uinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        // Taking a string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Reads a line of text (including spaces)

        // Taking an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Reads an integer value

        // Taking a double input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();  // Reads a double value

        // Taking a single word input
        System.out.print("Enter your favorite color: ");
        String color = scanner.next();  // Reads a single word (until space or newline)

        // Output the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Favorite Color: " + color);

        // Closing the scanner object
        scanner.close();
    }
}