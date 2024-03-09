import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0; // Initialize the year variable (for user input)
        int month = 0; // Initialize the month variable (for user input)
        int day = 0; // Initialize the day variable (for user input)
        int hour = 0; // Initialize the hour variable (for user input)
        int minute = 0; // Initialize the minute variable (for user input)
        year = SafeInput.getRangedInt(in,"Enter the year you were born",1950,2015); // Calls the SafeInput library and the getRangedInt method and inputs parameters and stores as a variable
        month = SafeInput.getRangedInt(in,"Enter the month you were born",1,12); // Calls the SafeInput library and the getRangedInt method and inputs parameters and stores as a variable
        switch(month) { // Switch case for month variable
            case 2: // Case: The month is 2 (february)
                day = SafeInput.getRangedInt(in,"Enter the day you were born",1,29); // Calls the SafeInput library and the getRangedInt method and inputs parameters (days 1-29) and stores as a variable
                break;
            case 4,6,9,11: // Case: The month is 4, 6, 9, or 11 (april, june, september, or november)
                day = SafeInput.getRangedInt(in,"Enter the day you were born",1,30); // Calls the SafeInput library and the getRangedInt method and inputs parameters (days 1-30) and stores as a variable
                break;
            case 1,3,5,7,8,10,12: // Case: The month is 1, 3, 5, 7, 8, 10, or 12 (january, march, may, july, august, october, or december)
                day = SafeInput.getRangedInt(in,"Enter the day you were born",1,31); // Calls the SafeInput library and the getRangedInt method and inputs parameters (days 1-31) and stores as a variable
                break;
        }
        hour = SafeInput.getRangedInt(in,"Enter the hour you were born",1,24); // Calls the SafeInput library and the getRangedInt method and inputs parameters and stores as a variable
        minute = SafeInput.getRangedInt(in,"Enter the minute you were born",1,59); // Calls the SafeInput library and the getRangedInt method and inputs parameters and stores as a variable
        System.out.println("\nYour birth year is " + year + ", your birth month is " + month + ", your birth day is " + day + ", your birth hour is " + hour + ", and your birth minute is " + minute); // Outputs the users birth year, month, day, hour, and minute
    }
}
