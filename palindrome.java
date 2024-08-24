
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int sum=0,r,temp,num;
        Scanner scanner=new Scanner(System.in);
        System.out.print("input the number :");
        num=scanner.nextInt();

        temp=num;
        while(num!=0){
            r=num%10;
            sum=sum*10+r;
            num/=10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not an palindrome number");
        }
        }
    }

