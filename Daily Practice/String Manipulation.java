import java.io.*;
import java.lang.*;

class StringManip
{
    public static void main(String args[]) throws IOException
    {
        // Creating a DataInputStream object for reading input from the user
        DataInputStream dis = new DataInputStream(System.in);

        // Creating a StringBuffer object with initial content "Hello"
        StringBuffer sb = new StringBuffer("Hello");

        // Printing introductory lines
        System.out.println("STRING MANIPULATION");
        System.out.println("*******************");

        // Taking two string inputs from the user
        System.out.println("Enter two strings:");
        String str = dis.readLine();    // First string (e.g., wel)
        String str1 = dis.readLine();   // Second string (e.g., come)

        // Performing various operations on the StringBuffer and strings

        System.out.println("Buffer: " + sb);    // Prints the current buffer (Hello)
        System.out.println("Length: " + sb.length());    // Length of buffer (5)
        System.out.println("Capacity: " + sb.capacity());    // Capacity of buffer (21)
        System.out.println("Insert: " + sb.insert(5, str));    // Inserts str into buffer (Hellowel)
        System.out.println("Delete: " + sb.delete(1, 3));    // Deletes from index 1 to 3 (Hlowel)
        System.out.println("Reverse: " + sb.reverse());    // Reverses the buffer (olewoH)

        System.out.println("Concatenation: " + str.concat(str1));    // Concatenates the two strings (welcome)
        System.out.println("Uppercase: " + str.toUpperCase());    // Converts str to uppercase (WELCOME)
        System.out.println("Lowercase: " + str.toLowerCase());    // Converts str to lowercase (welcome)
        System.out.println("Replace: " + str.replace('e', 'x'));    // Replaces 'e' with 'x' in str (wxlcxmx)
        System.out.println("Index of with place: " + str.indexOf('l'));    // Finds index of 'l' in str (2)
        System.out.println("Substring: " + str.substring(2));    // Extracts substring from index 2 onwards (l)
    }
}
