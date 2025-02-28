import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //enter the unit price
        System.out.print("Enter the unit price of the item in INR: ");
        int unitPrice = sc.nextInt();

        // user to enter the quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();

        // Calculate the total price
        int totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + 
                           " and the unit price is INR " + unitPrice);

    }
}
