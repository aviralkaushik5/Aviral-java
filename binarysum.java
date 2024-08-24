
import java.util.Scanner;

public class binarysum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("input 1st num :");
        int num=scanner.nextInt();

        System.out.print("input 2nd num:");
        int num2=scanner.nextInt();

        String binary1="";

        while(num > 0)
        {
            int reminder=num%2;
            binary1=reminder+binary1;
            num/=2;
        }
        System.out.println("binary number of 1st number is :"+binary1);

        String binary2 ="";

        while(num2>0){
            int reminder2=num2%2;
            binary2 = reminder2 + binary2;
            num2/=2;
        }
        System.out.println("binary of 2nd number is :"+binary2);

        String Sum = binary1 + binary2;
        System.out.print("sum of binary number is : "+Sum);


    }
}
