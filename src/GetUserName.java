import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = ""; // Initialize firstName variable (user input)
        String lastName = ""; // Initialize lastName variable (user input)
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name"); // Calls the SafeInput library and the getNonZeroLenString method and inputs parameters and stores as a variable
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name"); // Calls the SafeInput library and the getNonZeroLenString method and inputs parameters and stores as a variable
        System.out.println("\nYour full name is: " + firstName + " " + lastName); // Outputs the first name and last name (valid input)
    }
}