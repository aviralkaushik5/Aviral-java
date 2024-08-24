
import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input radius");
        double radius=scanner.nextDouble();
        double area=3.14*radius*radius;
        double perimeter=(2*3.14*radius);

        System.out.println("area="+area);
        System.out.println("perimeter ="+perimeter);
    }
}
