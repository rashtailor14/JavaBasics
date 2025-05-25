import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Program of calculating Simple Interest");
        System.out.println("Enter value of Principle: ");
        int P = input.nextInt();
        System.out.println("Enter value of Rate: ");
        float R = input.nextFloat();
        System.out.println("Enter Time in seconds: ");
        float T = input.nextFloat();

        float principle = (P * R * T) / 100;
        System.out.println("Simple Interest is: " +principle);

    }
}
