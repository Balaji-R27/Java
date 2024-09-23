/**
 * Students
 */
public class Students {
    int rollNumber;
    String name;
    String phoneNumber;
    String address;
    
    public static void main(String[] args) {
        // Creating data for the first student object (Sam)
        Students sam = new Students();
        sam.name = "Sam";
        sam.rollNumber = 1;
        sam.phoneNumber = "123-456-7890";
        sam.address = "123 MainStreet, City A";
        System.out.println(); // Line Break for Presentation

        // Creating data for the second student object (John)
        Students john = new Students();
        john.name = "John";
        john.rollNumber = 2;
        john.phoneNumber = "987-654-3210"; // Adding John's phone number
        john.address = "456 Elm St, City";

        // Printing Details for Sam
        System.out.println("Student Name: " + sam.name);
        System.out.println("Roll Number: " + sam.rollNumber);
        System.out.println("Phone Number: " + sam.phoneNumber);
        System.out.println("Address: " + sam.address);
        System.out.println(); // Line Break for Presentation

        // Printing Details for John
        System.out.println("Student Name: " + john.name);
        System.out.println("Roll Number: " + john.rollNumber);
        System.out.println("Phone Number: " + john.phoneNumber); // Will now display the correct phone number
        System.out.println("Address: " + john.address);
        System.out.println(); // Line Break for Presentation
    }  
}
