import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        //Ask user for number to sum to with this code:
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number to sum to: ");
        //Create an integer called sumTotal initialised to 0
        int sumTotal = 0;
         int user =  reader.nextInt();
        int counter = 1;
        while (counter <= user ) {
            sumTotal = (sumTotal + counter);
            counter ++;}
            System.out.println(sumTotal);


    }
}
