import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate Area of Triangle");
        System.out.println("Enter Height of Triangle: ");
        double Height = input.nextDouble();

        System.out.println("Enter Base of Triangle: ");
        double Base = input.nextDouble();

        double AreaCalculate = 0.5 * (Height * Base);
        System.out.println("Triangle Area calculations is: " + AreaCalculate + "cm");
    }
}
