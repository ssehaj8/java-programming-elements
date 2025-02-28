import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        int perimeter = sc.nextInt();

        // Calculate the side length using the formula: side = perimeter / 4
        int side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

    }
}
