
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("input the number to convert it into binary number :");
        int decimal = scanner.nextInt();
        String binary=" ";
        while(decimal>0)
        {
            int reminder= decimal%2;
            binary=reminder+binary;
            decimal=decimal/2;
        }
        System.out.println("binary number is : "+binary);
    }
    
}
