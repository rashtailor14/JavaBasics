import java.util.Scanner;

public class NumberDetermine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the program to Find out if the number is positive or negative");
        System.out.println("Enter the Number");

        int num = input.nextInt();

        if (num > 0){
            System.out.println("Your Number is Positive");
        } else if (num == 0){
            System.out.println("Your Number is Zero");
        } else {
            System.out.println("Your Number is negative");
        }
    }
}
