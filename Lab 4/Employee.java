class Employee {
    protected String name;
    protected int employeeId;

    // Constructor to initialize Employee details
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Method to display Employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}
