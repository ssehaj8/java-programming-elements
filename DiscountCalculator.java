
public class DiscountCalculator {
    public static void main(String[] args) {
        //the original fee and discount percentage as float
        float fee = 125000f;
        float discountPercent = 10f;

        // Calculate the discount amount
        float discount = fee * discountPercent / 100.0f;

        // Calculate the final fee after discount
        float finalFee = fee - discount;

       
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
