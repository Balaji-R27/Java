import java.util.Scanner;

class Average {
    // Method to calculate and print the average
    void calculateAverage(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        System.out.println("* The average is: " + average);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        
        // Taking input from the user
        System.out.print("* Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("* Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("* Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Creating an object of the Average class
        Average avg = new Average();
        
        // Calling the method to calculate and print the average
        avg.calculateAverage(num1, num2, num3);
    }
}
