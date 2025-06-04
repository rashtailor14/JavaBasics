import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Program of NOT/Compliment Operator");

        System.out.print("Please enter your Number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your result is: " +result);
    }
}
