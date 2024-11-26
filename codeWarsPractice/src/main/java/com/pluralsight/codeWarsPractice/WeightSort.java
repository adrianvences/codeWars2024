package com.pluralsight.codeWarsPractice;

import java.util.ArrayList;

public class WeightSort {
    public static String orderWeight(String strng) {
        // your code
        String[] digits = strng.split(" ");
        ArrayList<String> nums = new ArrayList<>();
        String convertedNumbers = "";
        for (String s : digits) {
            nums.add(s);
        }

        int sum = 0;
        for(String num : nums){
            String[] n = num.split("");
            for (String number : n){
                sum += Integer.parseInt(number);
            }

            convertedNumbers += Integer.toString(sum) + " ";
            sum = 0;
        }
        System.out.println(convertedNumbers);


        return convertedNumbers.trim();
    }
}

