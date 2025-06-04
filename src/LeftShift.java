import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Program of Left Shift Operator");

        System.out.print("Please enter your Number: ");
        int num = input.nextInt();

        int result = num << 4;
        System.out.println("Your result is: " +result);
    }
}
