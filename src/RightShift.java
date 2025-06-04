import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Program of Right Shift Operator");

        System.out.print("Please enter your Number: ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Your result is: " +result);
    }
}
