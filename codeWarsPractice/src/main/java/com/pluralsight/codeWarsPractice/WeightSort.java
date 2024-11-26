package com.pluralsight.codeWarsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class WeightSort {

    // function that sorts the weights
    public static String orderWeight(String strng) {
        // your code
        // splits String strng into an array
        String[] digits = strng.split(" ");

        // converts the array to an array list (this will allow sorting and manipulation)
        ArrayList<String> nums = new ArrayList<>(Arrays.asList(digits));

        //create an instance of the custom comparator class to sort the numbers
        ComparatorOfStrings c = new ComparatorOfStrings();

        // sort the arraylist using the custom comparator
        Collections.sort(nums,c);

        // StringBuilder to efficiently build the result string
        StringBuilder stringBuilder = new StringBuilder();

        // iterate through sorted list and append each element to the stringBuilder
        for(String s : nums){
            stringBuilder.append(s).append(" ");
        }

        // print the resulting string with leading trailing spaces removed
        System.out.println(stringBuilder.toString().trim());

        // return the final sorted string with spaces between numbers
        return stringBuilder.toString().trim();
    }
}

class ComparatorOfStrings implements Comparator<String> {

    @Override
    // override the compare method to define how two strings ( numbers ) should be compared
    public int compare(String o1, String o2) {
        // calculate the weight of string o1
        // calculate the weight of string o2
        String[] num1 = o1.split(""); // split first string into its characters
        String[] num2 = o2.split(""); // split second string into its characters

        // vars to hold strings to arrays of characters
        int sum = 0;
        int sum2 = 0;

        // calculate the sum of digits for num1
        for (String number : num1) {
            sum += Integer.parseInt(number);
        }

        // calculate the sum of digits for num2
        for (String number : num2) {
            sum2 += Integer.parseInt(number);
        }

        // compare the sum of digits for both numbers
        if (sum > sum2) { // if sum of digits of o1 is greater , o1 should come after o2
            return 1;
        } else if (sum < sum2) { // if sum of digits of o2 is greater , o2 should come after o1
            return -1;
        } else {
            // if both sums are equal, compare the numbers lexicographically (alphab order)
            return o1.compareTo(o2); // compare o1 and o2 in natural lexicographical order (as strings)
        }
        // if o1 is greater that o2 return positive num (1)
        // if o2 is greater than o1 return negative number (-1)
        // if the weight turns out to be the same compare them ->  o1.compareTo(o2)
        // sort using Collections.sort

    }

}
