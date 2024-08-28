public class VariableDemo {
    // Stack frames contain an "Evaluation area"
    // Stack frames contain all the data to the currently running
    public static void main(String[] args) {
        // Types must be declared first in Java
        int width = 10; // Instantiation
        System.out.print("width: ");
        System.out.println(width);

        width = 20; // Reassigning
        System.out.print("width: ");
        System.out.println(width);

        int height = 20;
        width = height + 10;
        System.out.print("width: ");
        System.out.println(width);

        width = width + 10;
        System.out.print("width: ");
        System.out.println(width);

    }

}
