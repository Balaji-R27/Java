
// class Pattern {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 5; j >= i; j--) {
//                 System.out.print("B ");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern
 * Explanation:
Outer Loop (for (int i = 1; i <= 5; i++)): This loop runs 5 times (for 5 rows).
Inner Loop (for (int j = 1; j <= i; j++)): This loop now prints an increasing number 
of Bs with each iteration. On the first row, it prints 1 B, and on the fifth row, it 
prints 5 Bs.
 */
//  class pattern {
//      public static void main(String args[]) {
//         // Outer Loop (for (int i = 1; i <= 5; i++)): This loop runs 5 times (for 5 rows).
//         for (int i = 1; i <= 5; i++) {
//         // // Inner Loop (for (int j = 1; j <= i; j++)): This loop now prints an increasing number 
//             for (int j=1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * pattern
 */
/**
 * pattern
 */
public class pattern {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++){
        for (int j = 1; j <= i; j++);
        System.out.print("* ");
    }
        System.out.println();
    }
}