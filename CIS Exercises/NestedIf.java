public class NestedIf {
    public static void main(String[] args) {
        int a = 2;
        if (a == 0) { // outer if/else
            System.out.println("in the block");
            if (a == 2) { // Inner if/else
                System.out.println("a is 2");
            } else {
                System.out.println("a is not 2");
            }
        } else {
            System.out.println("a is not 0");
        }
    }
}
