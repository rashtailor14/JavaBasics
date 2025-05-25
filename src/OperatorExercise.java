import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OperatorExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter value of a: ");
        int a = input.nextInt();
        System.out.println("Enter value of b: ");
        int b = input.nextInt();
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Division is: " + div);
        System.out.println("Modulus is: " + mod);

    }
}