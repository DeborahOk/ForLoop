import java.util.Random;
public class MaxAndMin {

    public static void main(String[] args) {
        // 2. create array of size 10, name this myArray
        int[] myArray = new int[10];
        // 3. create random instance called random
        Random random = new Random();
        // 4. Use for loop to access the index of array, inside this you generate random number between 1 - 10
        // 5. Still inside the loop, print the element
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10) + 1;
            System.out.println(myArray[i]);
        }
        // 6. Outside loop: create a new variable called minVal and maxVal to store the smallest and largest number
        // set it as myArray [0]
        int maxVal = myArray[0];
        int minVal = myArray[0];

        // 7. Use for loop to compare minVal to all elements of the array, change minVal if myArray[i] < minVal
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < minVal) { // if the element is less than minVal, update minVal
                minVal = myArray[i]; //update the value of the lowest number here
            }
            if (myArray[i] > maxVal) { // if the element is greater than maxVal, update maxVal
                maxVal = myArray[i];
            }
        }
        System.out.println("The smallest number is " + minVal);
        System.out.println("The biggest number is " + maxVal);
        // 8. Use for loop to compare maxVal to all elements of the array, change maxVal if myArray[i] > minVal



            //9. Print minVal and  maxVal


    }
}