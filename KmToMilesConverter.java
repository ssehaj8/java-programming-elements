import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        //enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        float km = sc.nextFloat();

        // Convert kilometers to miles (1 mile = 1.6 kilometers)
        float miles = km / 1.6f;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

    }
}
