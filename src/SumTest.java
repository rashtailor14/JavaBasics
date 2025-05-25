import java.util.Scanner;

public class SumTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Welcome " +name+ " to KG Coding");

        int a = input.nextInt();
        System.out.print("Enter value of a: " +a);
        int b = input.nextInt();
        System.out.print("Enter Value of b: "+b);
        int sum = a+b;
        System.out.println("Sum of "+a+ " and" +b+ " is: " +sum);
    }
}
