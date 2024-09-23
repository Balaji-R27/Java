import java.util.Scanner;

public class ArmstrongNumber {

    public static void printArmstrongNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            int originalNum = num, sum = 0, digits = String.valueOf(num).length();
            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }
            if (sum == originalNum) {
                System.out.println(originalNum + " is an Armstrong number.");
            }
            num = originalNum; // Reset num to originalNum for the next iteration
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\n* Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("* Enter end of range: ");
        int end = scanner.nextInt();
        printArmstrongNumber(start, end);
    }
}
