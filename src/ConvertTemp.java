import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to FahrenheitToCelsius");
        System.out.println("Enter your temperature in F: ");
        float tempF = input.nextFloat();
        float tempC = ((tempF - 32) * 5) / 9;

        System.out.println("Your Temperature is: " + tempC+ " C");
    }
}
