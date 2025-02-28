import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // enter values for a, b, and c
        System.out.print("Enter the value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the value for c: ");
        double c = sc.nextDouble();

        // Perform the operations
        double result1 = a + b * c;      // a + (b * c)
        double result2 = a * b + c;      // (a * b) + c
        double result3 = c + a / b;      // c + (a / b)
        double result4 = a % b + c;      // (a % b) + c

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

    }
}
