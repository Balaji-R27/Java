import java.util.Scanner;  // Importing Scanner class to read user input

public class EB {  // Define the main class for Electricity Bill calculation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Initialize Scanner for user input

        System.out.println();  // Print an empty line for spacing
        
        // Step 1: Define base tariff per unit and apply the 4.83% increase to calculate new tariff
        double baseTariff = 7.49;  // Set base tariff per unit before the price hike
        double increasedTariff = baseTariff * 1.0483;  // Calculate increased tariff with 4.83% increment

        // Step 2: Prompt the user to enter the number of units consumed
        System.out.print("Enter the number of units consumed: ");  // Prompt message for user input
        double units = scanner.nextDouble();  // Capture the number of units consumed

        // Step 3: Calculate the total bill amount based on units consumed
        double billAmount = units * increasedTariff;  // Total bill calculation using units and increased tariff

        // Step 4: Ensure minimum bill amount is met, set bill to Rs. 70 if below threshold
        if (billAmount < 70) {
            billAmount = 70;  // Set the minimum bill amount if calculated bill is less than Rs. 70
        }

        // Step 5: Display the final bill amount to the user
        System.out.println("The monthly EB bill amount is: " + billAmount);  // Output the calculated bill
        System.out.println();  // Print an empty line for formatting
    }
}
