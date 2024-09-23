import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        // Output result
        System.out.println("The binary representation of " + decimal + " is: " + binary);
    }
}
