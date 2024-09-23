import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;

    // Constructor to initialize Employee object
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}

class EmployeeManagement {
    private List<Employee> employees = new ArrayList<>();

    // Method to add an employee to the list
    void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Added: " + employee.name);
    }

    void removeEmployee(int id) {
        employees.removeIf(emp -> emp.id == id);
        System.out.println("Removed employee with ID: " + id);
    }

    void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            System.out.println("Employee List:");
            for (Employee emp : employees) {
                emp.display();
            }
        }
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. List Employees");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    management.addEmployee(new Employee(id, name, department));
                    break;

                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    management.removeEmployee(removeId);
                    break;

                case 3:
                    management.listEmployees();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
