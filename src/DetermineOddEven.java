import java.util.Scanner;

public class DetermineOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to program to Determine if Number is even or Odd");
        System.out.println("Enter your number");

        float num = input.nextFloat();

        if (num % 2 == 0){

            System.out.println("The number you entered is Even");
        }
        else{
            System.out.println("The number you entered is Odd");
        }
    }
}
