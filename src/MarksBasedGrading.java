import java.util.Scanner;

public class MarksBasedGrading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Program to Grade students based on their Percentage(Marks): ");
        System.out.println("Hey Student, Please enter your Grades: ");
        float percentage = input.nextFloat();

        if(percentage >= 90){
            System.out.println("Congratulations!! You have got A grade!");
        }
        else if(percentage >= 75){
            System.out.println("Great Job! You have got B Grade!");
        }
        else if(percentage >= 60){
            System.out.println("Work Hard! You have got C grade!");
        }
        else if(percentage >= 30){
            System.out.println("You got D grade");
        }
        else{
            System.out.println("Better Luck Next time! You got F grade!");
        }
    }
}
