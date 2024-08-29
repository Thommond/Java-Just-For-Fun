import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // Define input vars
        int intNum = 0;
        double doubleNum = 0.0;
        char charLetter = '*';
        String stringWord = "";
        // Instance of Scanner class
        Scanner scnr = new Scanner(System.in);
        // Prompt user 
        System.out.println("Please enter value for intNum");
        // Scan for input 
        intNum = scnr.nextInt();
        System.out.println("User's value for intNum is: " + intNum);

        // Keep prompting user by variable...
        // scnr.nextDouble() for doubles
        // scnr.next().charAt(0) for char (getting first char index 0)
        // scnr.next() just takes whatever is next as a string
    }
}
