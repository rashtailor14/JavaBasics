import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Program to check the Number if ODD or EVEN using Bitwise Operators");
        System.out.println("Enter a number: ");

        int num = input.nextInt();
        if ((num & 1) == 1){
            System.out.println("Your Number is ODD");
        }
        else{
            System.out.println("Your Number is EVEN");
        }
    }
}
