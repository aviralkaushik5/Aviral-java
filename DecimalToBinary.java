import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Get the decimal number from the user
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        // Logic to convert decimal to binary
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        
        // Output: Display the binary result
        System.out.println("Binary equivalent: " + binary);
    }
}