import java.util.Scanner;

public class GroupByAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Program to Group people by their Age");
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age <= 13){
            System.out.println("You are identified as Child");
        }
        else if (age <=20){
            System.out.println("You are identified as Teen");
        }
        else if (age <=60){
            System.out.println("You are identified as an Adult");
        }
        else{
            System.out.println("You are identified as a Senior");
        }
    }
}
