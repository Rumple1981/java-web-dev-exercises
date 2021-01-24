package exercises.ch3;

import java.lang.reflect.Array;
import java.util.ArrayList;                                             // step 4: import ArrayList utility
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;


public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayPractice arrayPractice = new ArrayPractice();

        String[] returnedWords = arrayPractice.splitAGivenString();
//        List<String[]> stooges = Arrays.asList(returnedWords);
//        ArrayList<String> wordsToSearch = stooges;
        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));  // .aslist symbol not found

        //Arrays.aslist("Dog", "Horse", "Cat");   // .aslist symbol not found
       //ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.aslist("Dog", "Horse", "Cat"));  // .aslist symbol not found
        //ArrayList<String> wordsToSearch = new ArrayList<>();
       // wordsToSearch.put("Dog");

//        ArrayList wordsToSearch=new ArrayList<>();
//        wordsToSearch.add("Dog");
//        wordsToSearch.add("Horse");
//        wordsToSearch.add("Cat");

        System.out.println("What word length are you looking for? ");
        Integer searchLength = ArrayListPractice.getUserSearchInput();
       ArrayListPractice.printWordsWithFiveLetters(wordsToSearch, searchLength);
    }

    public static Integer getUserSearchInput() {
        Scanner scanner = new Scanner(System.in);
        Integer myUsersInt = scanner.nextInt();
        scanner.close();
        return myUsersInt;
    }

    public static void printWordsWithFiveLetters(ArrayList<String> words, Integer searchLength) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }
    }

}


