
import java.util.Scanner;

public class sum_user {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("input number 1 : ");
        int num1= scanner.nextInt();

        System.out.print("input number 2 : ");
        int num2=scanner.nextInt();
        int sum=num1+num2;
        System.out.println("sum of number is : "+sum);
    }
}
