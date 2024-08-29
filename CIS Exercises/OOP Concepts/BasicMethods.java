public class BasicMethods {
    public static void main(String[] args) {
        // Calling methods in "constructor" (main method)
        method1();
        System.out.println("Method Type 1s return is nothing");
        method2(20);
        System.out.println("Method Type 2s return is nothing");
        int n = method3();
        System.out.println("Method Type 3s  return is: " + n);
        int m = method4(20);
        System.out.println("Method Type 4s return is: " + m);


    }
    // Four kinds of methods

    // Before making a method find the proper 
    // method name, return value parameters?

    // Type1: void method no return or parameters
    // Type2: void return and has parameters
    // Type3: return and has no parameters 
    // Type4: return and has parameters

    public static void method1() { // Type 1 method
        // No return value or params
        System.out.println("Method no return");
        return;
    }

    public static void method2 (int num) { // Type 2 method
        // Takes params but no return val
        int n = num/2;
        System.out.println("Parameter is " + num);
        System.out.println("Method calculated n which is " + n);
        return;
    }

    public static int method3() { // Type 3 Method
        // Takes no params but returns val
        int n = 50/2;
        System.out.println("Method parameter is nothing");
        System.out.println("Method calculated n: " + n);
        return n;
    }

    public static int method4(int num) { // Type 4 method
        // Takes params and returns values
        int n = num/2;
        return n;
    }

}
