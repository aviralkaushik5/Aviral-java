
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("student name : ");
        String name=scanner.nextLine();
        System.out.print("english :");
        int maths = scanner.nextInt();
        System.out.print("maths :");
        int english = scanner.nextInt();
        System.out.print("hindi :");
        int hindi=scanner.nextInt();

        int sum= (maths+english+hindi);
        double avg=sum/3;

        System.out.println(sum);
        System.out.println(avg);

        if(avg>=90)
        {
            System.out.println("A+");
        }
        else if(avg>=80)
        {
            System.out.println("B+");
        }
        else if(avg>=70)
        {
            System.out.println("C+");
        }
        else if(avg>=60)
        {
            System.out.println("D+");
        }
        else if(avg>=45)
        {
            System.out.println("rakh wa liye sar pr");
        }
        else
        {
            System.out.println("le moot diya tere exam pr");
        }

    }
}
