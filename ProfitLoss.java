public class ProfitLoss{
    public static void main(String[] args) {
        //cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        //profit
        int profit = sellingPrice - costPrice;

        //profit percentage
        int profitPercentage = (profit * 100) / costPrice; // Using int for whole number percentage

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n"
                         + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}
