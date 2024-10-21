package com.pluralsight.codeWarsPractice;

public class StairsOverYears {

        public static long stairsIn20 ( int[][] stairs)
        {
            long totalSteps = 0;
            for (int[] day : stairs) {
                for (int steps : day)
                    totalSteps += steps;

            }
                return totalSteps * 20;
        }
        }

