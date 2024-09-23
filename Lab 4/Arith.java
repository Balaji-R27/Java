// Parent class
public class Arith{
    int num1 = 55;
    int num2 = 100;

    // Subclass to create code for addition
    class Addition extends Arith {
        public void add() {
            int result = num1 + num2;
            System.out.println("***************");
            System.out.println("Addition: " + result);
        }
    }

    // Subclass to create code for subtraction
    class Subtraction extends Arith {
        public void subtract() {
            int result = num1 - num2;
            System.out.println("Subtraction: " + result);
        }
    }

    // Subclass to create code for multiplication
    class Multiplication extends Arith {
        public void multiply() {
            int result = num1 * num2; // Corrected the operation
            System.out.println("Multiplication: " + result);
            System.out.println("***************");
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        Arith main = new Arith(); // Creating an instance of the parent class

        // Creating objects of subclasses
        Addition add = main.new Addition();
        Subtraction sub = main.new Subtraction();
        Multiplication mul = main.new Multiplication();

        // Calling methods
        add.add();
        sub.subtract();
        mul.multiply();
    }
}
