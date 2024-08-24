
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);

        System.out.print(("input number :"));
        int num =sc.nextInt();
       
        while(i<=num){
            System.out.print(" "+i);
            i++;
        }

    }
}
