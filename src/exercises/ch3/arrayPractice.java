package exercises.ch3;   // task: loop over and print array


import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {				// step 5: test method by creating starting point ability to run it
        ArrayPractice arrayPractice = new ArrayPractice(); 	// step 6: initialize a new instance of ArrayPractice class
        //arrayPractice.printOddNumbers();    				// step 7: call to the methode we want to run.
        //arrayPractice.splitAGivenString();
        arrayPractice.splitAGivenStringIntoSentences();
    }

    public void printOddNumbers() {    				  		// step 1: initialize/create the "method" inside the class
        int[] myArrayOfInts = { 1, 1, 2, 3, 5, 8 };   		// step 2: Directly initialize the array

        for (int i = 0; i < myArrayOfInts.length; i++) { 	// step 3: create the for loop
            if (myArrayOfInts[i] % 2 == 1) {				// logic option (print odd): step 8: set up an "if" gate to only allow printing under a given condition
                System.out.println(myArrayOfInts[i]);		// step 4: print (println) array (myArrayOfInts) of any given index [i]
            }
        }
    }

    public void splitAGivenString() {                                // step 1: initialize method. goal: store individul words into an array
        String myProvidedString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";  // step 2: Directly initialize the string I will split
        String[] mySplitStringS = myProvidedString.split(" ");
        System.out.println(Arrays.toString(mySplitStringS));         // Step X: add the Java utility class Arrarys. This needs import java.util.Arrays; added on line 4 before the class ArrayPractice is started
    }

    public void splitAGivenStringIntoSentences() {                                // step 1: initialize method. goal: store individul words into an array
        String myProvidedString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";  // step 2: Directly initialize the string I will split
        String[] mySplitStringS = myProvidedString.split("\\.");
        System.out.println(Arrays.toString(mySplitStringS));         // Step X: add the Java utility class Arrarys. This needs import java.util.Arrays; added on line 4 before the class ArrayPractice is started
    }
}

