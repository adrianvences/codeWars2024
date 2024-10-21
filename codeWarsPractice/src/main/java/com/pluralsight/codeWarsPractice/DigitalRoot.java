package com.pluralsight.codeWarsPractice;

public class DigitalRoot {

        public static int digital_root(int n) {
            // ...
            int sumOfNumSplit = n;

            while(sumOfNumSplit >= 10){
                sumOfNumSplit = 0;
                String numString = String.valueOf(n);
                String[] numSplit = numString.split("");

                for (String num : numSplit) {
                    sumOfNumSplit += Integer.parseInt(num);
                }
                n = sumOfNumSplit;
            }
            return sumOfNumSplit;
        }




}
