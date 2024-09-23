import java.util.Scanner;  // Import the Scanner class for user input

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input

        // Step 1: Input the principal amount (P)
        System.out.println();
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();  // Read the principal amount

        // Step 2: Input the time period (T)
        System.out.print("Enter the time period in years (T): ");
        double time = scanner.nextDouble();  // Read the time period

        // Step 3: Input the rate of interest (R)
        System.out.print("Enter the rate of interest (R): ");
        double rate = scanner.nextDouble();  // Read the rate of interest

        // Step 4: Calculate Simple Interest
        double simpleInterest = (principal * time * rate) / 100;

        // Step 5: Output the Simple Interest
        System.out.println("The Simple Interest is: " + simpleInterest);
    }
}
