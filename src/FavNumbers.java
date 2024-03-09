import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = 0; // Initialize favInt variable (user input)
        double favDouble = 0; // Initialize favDouble variable (user input)
        favInt = SafeInput.getInt(in,"Enter your favorite integer"); // Calls the SafeInput library and the getInt method and inputs parameters and stores as a variable
        favDouble = SafeInput.getDouble(in,"Enter your favorite double"); // Calls the SafeInput library and the getDouble method and inputs parameters and stores as a variable
        System.out.println("\nYour favorite integer is " + favInt); // Outputs favInt (valid input)
        System.out.println("\nYour favorite double is " + favDouble); // Outputs favDouble (valid input)
    }
}
