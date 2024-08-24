
import java.util.Scanner;

public class concatination {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input the 1st string :");
        String name = scanner.nextLine();

        System.out.println("input the 2nd string :");
        String name2 =scanner.nextLine();
        
        System.out.println("concatinated string is :" );
        System.out.println(name+" "+name2);

        String full_name = name + name2;
        System.out.println("lenght of the string is :"+full_name.length());
        
        System.out.println("charater in the string are : "+full_name.indexOf("locate"));

    }
}
