package exercises.ch3;   // task: loop over and print array

public class ArrayPractice {

    public static void main(String[] args) {				// step 5: test method by creating starting point ability to run it
        ArrayPractice arrayPractice = new ArrayPractice(); 	// step 6: initialize a new instance of ArrayPractice class
        arrayPractice.printOddNumbers();    				// step 7: call to the methode we want to run.
    }

    public void printOddNumbers() {    				  		// step 1: create the "method" inside the class
        int[] myArrayOfInts = { 1, 1, 2, 3, 5, 8 };   		// step 2: Directly initialize the array

        for (int i = 0; i < myArrayOfInts.length; i++) { 	// step 3: create the for loop
            if (myArrayOfInts[i] % 2 == 1) {				// logic option (print odd): step 8: set up an "if" gate to only allow printing under a given condition
                System.out.println(myArrayOfInts[i]);			// step 4: print (println) array (myArrayOfInts) of any given index [i]
            }
        }
    }
}

