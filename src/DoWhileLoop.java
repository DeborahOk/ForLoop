
public class DoWhileLoop {
    public static void main(String[] args) {
        // do...while : execute at least once, then check the condition, loop as long as it is true
        int x=0;
        do {
            System.out.println("Do while loop counter :" + x);
            // update the counter
            x++; // y = 0 + 1 = 1
        } while (x<20);
    }
}
