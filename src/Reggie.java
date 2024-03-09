import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = ""; // Initialize SSN variable (user input)
        String studentMNumber = ""; // Initialize studentMNumber variable (user input)
        String menuChoice = ""; // Initialize menuChoice variable (user input)
        SSN = SafeInput.getRegExString(in,"Enter your SSN","^\\d{3}-\\d{2}-\\d{4}$"); // Calls the SafeInput library and the getRegExString method and inputs parameters and stores as a variable
        studentMNumber = SafeInput.getRegExString(in,"Enter your student M number","^(M|m)\\d{5}$"); // Calls the SafeInput library and the getRegExString method and inputs parameters and stores as a variable
        menuChoice = SafeInput.getRegExString(in,"Would you like to open, save, view, or quit?","^[OoSsVvQq]$"); // Calls the SafeInput library and the getRegExString method and inputs parameters and stores as a variable
        System.out.println("Your SSN is " + SSN); // Outputs the users SSN (in the correct pattern)
        System.out.println("Your student M number is " + studentMNumber); // Outputs the users M number (in the correct pattern)
        System.out.println("Your menu choice is " + menuChoice); // Outputs the users menu choice (in the correct pattern)
    }
}
