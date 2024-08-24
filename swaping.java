
import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("input number 1 :");
        int num1=scanner.nextInt();

        System.out.print("input num 2 :");
        int num2=scanner.nextInt();

        System.out.println("numbers before swapping :");
        System.out.println("num1 :"+num1);
        System.out.println("num2 :"+num2);

        int temp;

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("numbers before swapping :");
        System.out.println("num1 :"+num1);
        System.out.println("num2 :"+num2);
    }
}
