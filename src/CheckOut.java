import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double priceOfItem = 0; // Initialize priceOfItem variable (user input)
        double totalCost = 0; // Initialize totalCost variable (sum of all prices user inputs)
        boolean yesOrNo = false; // Initialize yesOrNo boolean variable and set to false for while loop
        do {
            priceOfItem = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00); // Calls the SafeInput library and the getRangedDouble method and inputs parameters and stores as a variable
            totalCost += priceOfItem; // Set totalCost to the previous total cost plus the new price of item (if user has more items, the total cost of items updates)
            yesOrNo = SafeInput.getYNConfirm(in, "Do you have more items?"); // Calls the SafeInput library and the getYNConfirm method and inputs parameters and stores as a variable
        } while(yesOrNo); // Loop: While yesOrNo is true (if user says yes, then that means yesOrNo is true, and the loop will keep going until user says no, which means yesOrNo is false)
        System.out.printf("\nThe total cost of your item(s) are %.2f", totalCost); // Outputs the totalCost of users items
    }
}