// Base class
class MultilevelInheritance {
    // Fields representing basic employee details
    String name = "John";
    int id = 101;
    
    // Method to display basic employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// Intermediate class
class Manager extends MultilevelInheritance {
    // Additional field specific to Manager
    String department = "HR";
    
    // Method to display manager-specific details
    public void displayManagerDetails() {
        System.out.println("Department: " + department);
    }
}

// Derived class
class SeniorManager extends Manager {
    // Additional field specific to Senior Manager
    int yearsOfExperience = 15;
    
    // Method to display senior manager-specific details
    public void displaySeniorManagerDetails() {
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Creating an instance of SeniorManager, which inherits from Manager and Employee
        SeniorManager sm = new SeniorManager();
        
        // Calling methods to display details from the base class and derived classes
        sm.displayEmployeeDetails();          // Displays details from Employee class
        sm.displayManagerDetails();           // Displays details from Manager class
        sm.displaySeniorManagerDetails();     // Displays details from SeniorManager class
    }
}
