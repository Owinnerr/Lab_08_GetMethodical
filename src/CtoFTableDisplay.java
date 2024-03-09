public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit"); // Prints the table header row
        for (double celsius = -100; celsius <= 100; celsius++) { // Loop: Initialize variable celsius and set it to -100, set it less than or equal to 100, and increase celsius by 1 until loop ends
            System.out.println(celsius + "\t" + CtoF(celsius)); // Output the celsius and fahrenheit temperatures
        }
    }
    public static double CtoF(double Celsius) {
        double fahrenheit = 1.8 * (Celsius) + 32; // Initializes fahrenheit variable and sets to the celsius to fahrenheit equation
        return fahrenheit; // Returns fahrenheit because this is not a void method
    }
}
