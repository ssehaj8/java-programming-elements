import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        //user to enter base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        float base = sc.nextFloat();

        System.out.print("Enter the height of the triangle in cm: ");
        float height = sc.nextFloat();

        // Calculate area in square centimeters
        float areaSqCm = 0.5f * base * height;

        // Convert area to square inches (1 in² = 2.54 * 2.54 cm²)
        float areaSqIn = areaSqCm / (2.54f * 2.54f);

        System.out.println("The Area of the triangle in sq in is " + areaSqIn + 
                           " and in sq cm is " + areaSqCm);

    }
}
