import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        float heightInCm = sc.nextFloat();

        // Convert height from cm to inches (1 inch = 2.54 cm)
        float heightInInches = heightInCm / 2.54f;

        // Convert height in inches to feet and remaining inches
        int feet = (int) (heightInInches / 12);
        int inches = (int) (heightInInches % 12);

        
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);

 
    }
}
