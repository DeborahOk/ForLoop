import java.util.Scanner; // create Scanner object
public class TimesTable {
    public static void main(String[] args) {
        {


            // print out, "What times table would you like to make ?"
            System.out.println("What times table would you like to make?");
            Scanner reader = new Scanner(System.in);
            // read the user input, save inside variable "timesTable", read using .nextInt()
            int timesTable = reader.nextInt();
            // use for loop, counter from 1 to 12, incrementing
            for (int i = 1; i <= 12; i++) {
                // inside the loop, print the times table and calculate timesTable * counter
                System.out.println(i + "x" + timesTable + "=" + i * timesTable);
            }

        }

    }
}
