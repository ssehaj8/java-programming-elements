import java.util.Scanner;

public class DiScountCalculaterInput {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        //take input from user
        System.out.print("Enter the student fee (INR): ");
        float fee = sc.nextFloat();

        System.out.print("Enter the university discount percentage: ");
        float discountPercent = sc.nextFloat();

        // Calculate the discount amount
        float discount = fee * discountPercent / 100.0f;

        // Calculate the final fee after discount
        float finalFee = fee - discount;

       
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);

    }
}
