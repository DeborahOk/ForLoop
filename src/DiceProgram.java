import java.util.Random;
public class DiceProgram {
    public static void main(String[] args) {
        // create an instance/object of the random
        Random random = new Random();

        int diceNumber = random.nextInt(12)+1;

        System.out.println("The crazy dice number is " + diceNumber);
    }
}