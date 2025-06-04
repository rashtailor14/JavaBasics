import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int num = 1;  // initialization
        while (num <= 10){ //condition
            System.out.println(num); //actual work
            num = num+1; //Increment
        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5){
            int count = input.nextInt();
            System.out.println("Your Number is: " + count);
            i = i + 1;
        }
    }
}
