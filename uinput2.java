
import java.util.Scanner;

public class uinput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter name : ");
        String name = scanner.nextLine();

        System.out.print("enter your age : ");
        int age = scanner.nextInt();

        System.out.print("enter your salary : ");
         float salary = scanner.nextFloat();

         System.out.println("ur age : "+name);
         System.out.println("ur age : "+age);
         System.out.println("ur salary : "+salary);
    }
}
