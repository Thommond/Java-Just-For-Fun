public class ForLoopDemo {
    public static void main(String[] args) {
        for(int i = 1; i < 4; i++) {
            System.out.println("Count: " + i);
        }

        int limit = 3; 
        int sum = 0;

        for (int i = 1, j = 0; i <= limit; i++, j++) {
            sum += i * j;
        }

        System.out.println(sum);
    }
    
}
