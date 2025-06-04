import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Bitwise Operator Program for using OR operator");
        System.out.print("Please enter number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Please enter number 2: ");
        int num2 = input.nextInt();

        int results = num1 | num2;
        System.out.println("The Result is: " +results);
    }
}
