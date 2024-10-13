package com.pluralsight.codeWarsPractice;

public class DogCatYears {


    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int catYearsToHumanYears = calcCatAge(catYears);
        int dogYearsToHumanYears = calcDogAge(dogYears);
        int[] result = new int[2];
        result[0] = catYearsToHumanYears;
        result[1] = dogYearsToHumanYears;
        return result;

    }
    public static int calcCatAge(int catYears){
        int humanYears = 0;

        if (catYears < 15) {
            return 0; // Less than 15 cat years = 0 human years
        } else if (catYears <= 24) {
            humanYears = 1; // First year
            humanYears += (catYears - 15) / 9; // Second year and onwards
            return humanYears;
        } else {
            // First two years account for 15 + 9 = 24
            humanYears = 2;
            // Add 4 for each year beyond 24
            humanYears += (catYears - 24) / 4;
            return humanYears;
        }





    }

    public static int calcDogAge(int dogYears) {
        int humanDogYears = 0;

        if (dogYears < 15) {
            return 0; // Less than 15 dog years = 0 human years
        } else if (dogYears <= 24) {
            humanDogYears = 1; // First year
            humanDogYears += (dogYears - 15) / 9; // Second year and onwards
            return humanDogYears;
        } else {
            // First two years account for 15 + 9 = 24
            humanDogYears = 2;
            // Add 5 for each year beyond 24
            humanDogYears += (dogYears - 24) / 5;
            return humanDogYears;
        }

    }





}