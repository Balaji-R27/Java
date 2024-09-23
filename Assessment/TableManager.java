import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//  Step 1
// Main class to manage a table of records
public class TableManager {
    
    // HashMap to store records as key-value pairs
    // Key: Integer ID, Value: String record
    private static Map<Integer, String> table = new HashMap<>();

    //  Step 2
    // Main method where program execution begins
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        int choice; // Variable to store user's menu choice

        //  Step 3
        // Loop until user chooses to exit
        do {
            // Display menu options to the user
            System.out.println("\n1. Add Record");
            System.out.println("2. Update Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Get Record");
            System.out.println("5. Exit");

            // Prompt the user for their choice
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Read the choice as an integer
            scanner.nextLine(); // Consume the newline character

            //  Step 4
            // Perform action based on user choice
            switch (choice) {
                case 1 -> addRecord(scanner);   // Add a new record
                case 2 -> updateRecord(scanner); // Update an existing record
                case 3 -> deleteRecord(scanner); //
                
                //  Step 5
                // Delete a record by ID
                case 4 -> getRecord(scanner);    // Retrieve a record by ID
                case 5 -> System.out.println("Exiting..."); // Exit the program
                default -> System.out.println("Invalid choice. Please try again."); // Handle invalid input
            }
        } while (choice != 5); // Continue until user selects 'Exit'

        scanner.close(); // Close the scanner resource
    }

    // Method to add a new record
    private static void addRecord(Scanner scanner) {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt(); // Read ID from user
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Record: ");
        String record = scanner.nextLine(); // Read the record from user

        table.put(id, record); // Add the record to the HashMap
        System.out.println("Record added successfully."); // Confirm addition
    }

    // Method to update an existing record
    private static void updateRecord(Scanner scanner) {
        System.out.print("Enter ID to update: ");
        int id = scanner.nextInt(); // Read the ID to update
        scanner.nextLine(); // Consume the newline character

        // Check if the record exists
        if (table.containsKey(id)) {
            System.out.print("Enter new Record: ");
            String newRecord = scanner.nextLine(); // Read new record

            table.put(id, newRecord); // Update the record in the HashMap
            System.out.println("Record updated successfully."); // Confirm update
        } else {
            System.out.println("Record with ID " + id + " not found."); // Record not found
        }
    }

    // Method to delete a record by ID
    private static void deleteRecord(Scanner scanner) {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt(); // Read the ID to delete
        scanner.nextLine(); // Consume the newline character

        // Remove the record and check if it existed
        if (table.remove(id) != null) {
            System.out.println("Record deleted successfully."); // Confirm deletion
        } else {
            System.out.println("Record with ID " + id + " not found."); // Record not found
        }
    }

    // Method to retrieve a record by ID
    private static void getRecord(Scanner scanner) {
        System.out.print("Enter ID to get: ");
        int id = scanner.nextInt(); // Read the ID to retrieve
        scanner.nextLine(); // Consume the newline character

        // Retrieve and display the record, or show 'not found' message
        System.out.println("Record: " + table.getOrDefault(id, "Record with ID " + id + " not found."));
    }
}
