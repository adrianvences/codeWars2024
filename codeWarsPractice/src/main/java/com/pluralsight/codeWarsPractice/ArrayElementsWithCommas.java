package com.pluralsight.codeWarsPractice;

public class ArrayElementsWithCommas {

    public static String printArray(Object[] array) {

        // used StringBuilder for easier modification of string
        StringBuilder completeString = new StringBuilder();

        //loop through array
        for(Object word : array) {

            //add word to completeString
            completeString.append(word);
            // adds comma after word
            completeString.append(",");
        }
        // deletes last value
        completeString.deleteCharAt(completeString.length() -1);
        return completeString.toString();
    }
}
