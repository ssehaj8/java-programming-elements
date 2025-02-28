import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = sc.nextFloat();

        // Convert feet to yards (1 yard = 3 feet)
        float distanceInYards = distanceInFeet / 3;

        // Convert feet to miles (1 mile = 1760 yards)
        float distanceInMiles = distanceInYards / 1760;

        // Display the result
        System.out.println("The distance in yards is " + distanceInYards + " and the distance in miles is " + distanceInMiles);

        
    }
}
