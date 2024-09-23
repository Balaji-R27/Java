import java.util.Scanner;
public class OddEvenCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int evenCount =0, OddCount =0, number;

        System.out.println("\n*Enter the Number(-1 to stop):" );

        // Looping Functions
        while(true){
            number = scanner.nextInt(); //user input
            if(number == -1) break; // break the loop if -1 entered by user
            
            if(number % 2 == 0)
                evenCount++; //count even numbers
            else
                OddCount++; // count odd numbers
        }
        System.out.println("* Total Given Even Number: " + evenCount);
        System.out.println("* Total Given Odd Number: " + OddCount);
        scanner.close();

    }
    
}