
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int sum=0,r,temp,num;
        Scanner scanner=new Scanner(System.in);
        System.out.print("input the number :");
        num=scanner.nextInt();

        temp=num;
        while(num!=0){
            r=num%10;
            sum+=(r*r*r*r);
            num/=10;
        }
        if(temp==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not an armstrong number");
        }

        }
    }

