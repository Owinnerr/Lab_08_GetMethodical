import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // getNonZeroLenString
        String userString = SafeInput.getNonZeroLenString(in, "Enter a string"); // Calls the SafeInput library and the getNonZeroLenString method and inputs parameters and stores as a variable
        System.out.println("Your string is " + userString); // Output the user inputted string (valid input)
        // getInt
        int userInt = SafeInput.getInt(in, "Enter an int value"); // Calls the SafeInput library and the getInt method and inputs parameters and stores as a variable
        System.out.println("Your int value is " + userInt); // Output the user inputted int (valid input)
        // getDouble
        double userDouble = SafeInput.getDouble(in, "Enter a double value"); // Calls the SafeInput library and the getDouble method and inputs parameters and stores as a variable
        System.out.println("Your double value is " + userDouble); // Output the user inputted double (valid input)
        // getRangedInt
        int userRangedInt = SafeInput.getRangedInt(in, "Enter a int value", 1, 10); // Calls the SafeInput library and the getRangedInt method and inputs parameters and stores as a variable
        System.out.println("Your int value in the range is " + userRangedInt); // Output the user inputted int (valid input and in range)
        // getRangedDouble
        double userRangedDouble = SafeInput.getRangedDouble(in, "Enter a double value", 1.0, 10.0); // Calls the SafeInput library and the getRangedDouble method and inputs parameters and stores as a variable
        System.out.println("Your double value in the range is " + userRangedDouble); // Output the user inputted double (valid input and in range)
        // getYNConfirm
        boolean yesOrNo = SafeInput.getYNConfirm(in, "Would you like to continue"); // Calls the SafeInput library and the getYNConfirm method and inputs parameters and stores as a variable
        System.out.println(yesOrNo); // Output the true or false boolean (true if y, false if n)
        // getRegExString
        String regEx = SafeInput.getRegExString(in,"Enter your SSN", "\\d{3}-\\d{2}-\\d{4}"); // Calls the SafeInput library and the getRegExString method and inputs parameters and stores as a variable
        System.out.println("Your SSN is " + regEx); // Output the user inputted SSN (valid pattern)
    }
}
