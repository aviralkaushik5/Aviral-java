
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("input starting number :");
        int st=sc.nextInt();
        System.out.print("input last number :");
        int ed=sc.nextInt();

        while(st>=ed){
            System.out.println("\n"+st);
            st--;
        }
    }
}
