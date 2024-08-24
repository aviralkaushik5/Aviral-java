
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scanner =new Scanner( System.in);

        System.out.println("input number :");
        int num=scanner.nextInt();

        for (int  i= 0; i < 10; i++) {
            System.out.println(num + "x" +(i+1)+"="+(num*(i+1)));
        }
    }
    
}
