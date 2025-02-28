import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // take user input
        Scanner sc = new Scanner(System.in);

        // user to enter distance in feet
        System.out.print("Enter the distance in feet: ");
        int distanceInFeet = sc.nextInt();

        // Convert feet to yards (1 yard = 3 feet)
        int distanceInYards = distanceInFeet / 3;

        // Convert feet to miles (1 mile = 1760 yards)
        int distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards + 
                           " while the distance in miles is " + distanceInMiles);

    }
}
