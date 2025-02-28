import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //enter values for a, b, and c
        System.out.print("Enter the value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value for c: ");
        int c = sc.nextInt();

        // Perform the integer operations
        int result1 = a + b * c;      // a + (b * c)
        int result2 = a * b + c;      // (a * b) + c
        int result3 = c + a / b;      // c + (a / b)
        int result4 = a % b + c;      // (a % b) + c

        // Print the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);


   }
}
