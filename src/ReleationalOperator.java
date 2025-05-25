import java.util.Scanner;
import java.util.SortedMap;

public class ReleationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving Licence Portal");
        System.out.println("Enter Your Age: ");

        int age = input.nextInt();

        if (age >= 18){
            System.out.println("you are eligible to Drive");
        }
        else {
            System.out.println("You CANT Drive");
        }
    }
}
