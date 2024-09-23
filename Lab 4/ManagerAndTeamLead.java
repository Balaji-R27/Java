class Manager extends Employee {
    protected String department;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    public void displayManagerDetails() {
        displayDetails(); // Calls method from Employee class
        System.out.println("Department: " + department);
    }
}


// TeamLead class inherits from Manager class
class TeamLead extends Manager {
    protected int teamSize;

    public TeamLead(String name, int employeeId, String department, int teamSize) {
        super(name, employeeId, department);
        this.teamSize = teamSize;
    }

    public void displayTeamLeadDetails() {
        displayManagerDetails(); // Calls Manager class method
        System.out.println("Team Size: " + teamSize);
    }
}


// Main class to test the program
public class ManagerAndTeamLead {
    public static void main(String[] args) {
        TeamLead lead = new TeamLead("John Doe", 101, "IT", 5);
        lead.displayTeamLeadDetails(); // Test the display methods
    }
}
