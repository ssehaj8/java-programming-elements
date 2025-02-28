import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Take user input for unit price and quantity
        System.out.print("Enter the unit price of the item (INR): ");
        float unitPrice = sc.nextFloat();

        System.out.print("Enter the quantity of the item: ");
        int quantity = sc.nextInt();

        // Calculate the total price
        float totalPrice = unitPrice * quantity;

        // Display the total price
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        
    }
}
