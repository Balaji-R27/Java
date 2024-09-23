class Employee {
    String name;
    int yearOfJoining;
    String address;

    // Constructor to initialize employee details
    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.printf("%-10s %-18d %-20s%n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
        System.out.println();
        // Creating objects for three employees
        Employee emp1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, "26B- WallsStreat");

        // Printing header
        System.out.printf("%-10s %-18s %-20s%n", "Name", "Year of Joining", "Address");
        
        // Displaying details of each employee
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
        System.out.println();
    }
}
