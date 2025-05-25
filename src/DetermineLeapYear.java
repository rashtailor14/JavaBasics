import java.util.Scanner;

public class DetermineLeapYear {
    // Consider condition Like Divisible by 4 but not 100, unless also divisible by 400
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program to determine ");

        System.out.println("Please Enter the Year you want to check: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Your year is a leap Year");
        }
        else{
            System.out.println("Your year is not a leap Year");
        }
    }
}
