import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[10];
        int[] myArray2 = new int[10];

        System.out.println("Array 1 = ");
        for (int i = 0; i< myArray.length; i++) {
            myArray[i]= random.nextInt(20)+1;
            System.out.print(myArray[i]+ " ");
        }
        // generating random numbers for array 2
        // print in one line
        System.out.println();
        System.out.println("Array 2 = ");
        for (int i = 0; i< myArray2.length; i++) {
            myArray2[i]= random.nextInt(20)+1;
            System.out.print(myArray2[i]+ " ");
        }
        // find the duplicates using nested for loop
        // if array 1 [i] == array 2 [j], print the value
        System.out.println("\nPrinting duplicated values ");
        for (int i=0; i < myArray.length; i++){ // access index of array1
            for (int j=0; j < myArray2.length; j++) { // access index of array2
                if (myArray[i] == myArray2[j]){
                    System.out.print(myArray[i] + " ");
                }
            }
        }

    }
}

// import Random class

        // create random object

        // initialise array 1, size 10
        // initialise array 2, size 10

        // generating random numbers for array 1
        // print in one line

        // generating random numbers for array 2
        // print in one line

        // find the duplicates using nested for loop
        // if array 1 [i] == array 2 [j], print the value


