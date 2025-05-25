import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to compound interest calculator");
        System.out.println("Enter value of Principle: ");
        int P = input.nextInt();
        System.out.println("Enter value of Rate: ");
        float R = input.nextFloat();
        System.out.println("Enter Time in seconds: ");
        float T = input.nextFloat();

        double compInt = P * Math.pow((1 + R / 100), T);
        System.out.println("Your Compound Interest is Rs: " + compInt);
    }
}
