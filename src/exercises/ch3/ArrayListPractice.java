package exercises.ch3;

import java.util.ArrayList;                                             // step 4: import ArrayList utility
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> numbersToSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Integer theSum = ArrayListPractice.sumAllEvenValues(numbersToSum);
        //ArrayListPractice.sumAllEvenValues(numbersToSum);
        System.out.println("The sum is: " + theSum.toString());
    }

    public static Integer sumAllEvenValues(ArrayList<Integer> valuesToSum) {
        Integer sum = 0;
        for (int i = 0; i < valuesToSum.size(); i++)  {

            if (valuesToSum.get(i) % 2 == 0) {
                sum = sum + valuesToSum.get(i);  // or sum += valuesToSum.get(i)
                //System.out.println(valuesToSum.get(i));
            }
        }
        return sum;
        //return 0;
    }

}
