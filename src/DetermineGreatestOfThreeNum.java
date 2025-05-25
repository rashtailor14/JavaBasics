import java.util.Scanner;

public class DetermineGreatestOfThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Program to Determine the Greatest Number of the three numbers");
        System.out.println("Please enter Number 1: ");
        int num1 = input.nextInt();

        System.out.println("Please enter Number 2: ");
        int num2 = input.nextInt();

        System.out.println("Please enter Number 3: ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("Greatest Number is: " + num1);
        }
        else if (num2 >= num1 && num2 >= num3){
            System.out.println("Greatest Number is: " +num2);
        }
        else{
            System.out.println("Greatest Number is: " + num3);
        }
    }
}
