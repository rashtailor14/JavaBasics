import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Scanner is used to take input from user. you can use input variable
        System.out.println("Swapping Program:");
        System.out.println("Enter Value of a: ");
        int a = input.nextInt();
        System.out.println("Enter value of b: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;

        System.out.println("After Swaping value of a is: " +a+ " and b is: " +b);


    }
}
