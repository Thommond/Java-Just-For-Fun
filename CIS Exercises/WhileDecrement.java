public class WhileDecrement {
    public static void main(String[] args) {
        int n = 1729;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; // Modulo / Remainder
            sum = sum + digit;
            n = n / 10; // Decrement
        }
    }
}
