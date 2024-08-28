/**
 * ConstDemo2
 */
public class ConstDemo2 {
public static void main(String[] args) {

    // Constants are doubles 
        // Constants are used with "keyword" final
        // They are conventionally written in all CAPS
    // Variable declarations
    final double QUARTER_VALUE = 0.25;
    final double DIME_VALUE = 0.1;
    final double NICKEL_VALUE = 0.05;
    final double PENNY_VALUE = 0.01;

    int dollars = 4;
    int quarters = 1;
    int dimes = 2;
    int nickels = 3; 
    int pennies = 6;

    double payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    System.out.println(payment);


    // 1 - 7 Review 
        
    // What is a double vs a int? 
        // double is a decimal and in is a whole. 

    // What is the difference between print and println?
        // Print does not print a new line after the value
        // and println does
    // What difference does double to int conversion have 
    // compared to int to double? 
        // Answered that in a later question. 
    // What is the stack, stack frame, and eval area?
        // Stack is the scope of a file 
            // The stack frame is the curren scope or method usually 
            // The evaluation area is the curren process being evaluated 
            // from the stack frames data.
    // How are Java files written? 
        // By the name of a class conventionally

    // What is the structure of Java?
        // Object oriented where all files have a class 
        // There is the public main method or "constructor"

    // What is an operation?
        // The + or * operator are operations with variables and values
    // What data types do you know?
        // A: Double, string, int, final double (Constants), short, etc

    // What is explicit and implcit type casting?
        // Implicit is done by Java like int to double
        // Explicit is done by the programmer like double to int
}
    
}