import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.println("Please Enter value of a: ");
        int a = input.nextInt();
        System.out.print("Please Enter Value of b: ");
        int b = input.nextInt();

        int sum = a+b;
        System.out.println("Sum of "+a+ " and " +b+ " is: " +sum);
    }
}
