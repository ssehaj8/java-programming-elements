import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc= new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes);

        
    }
}
