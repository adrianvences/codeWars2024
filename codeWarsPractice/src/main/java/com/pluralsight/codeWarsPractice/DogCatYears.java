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
        if (catYears <= 0){
            return humanYears;
        }
        if (catYears >= 15) {
            humanYears += 1;
            catYears -= 15;
        }
        if (catYears >= 9) {
            humanYears += 1;
            catYears -= 9;
        }
        if (catYears > 0) {
            humanYears += catYears / 4;
        }
        return humanYears;
    }

    public static int calcDogAge(int dogYears){
        int humanYears = 0;
        if(dogYears <= 14){
            return humanYears;
        }
        if (dogYears >= 15) {
            humanYears += 1;
            dogYears -= 15;
        }
        if (dogYears >= 9) {
            humanYears += 1;
            dogYears -= 9;
        }
        // working on this
        if (dogYears >= 5) {
            humanYears += dogYears / 5;
        }
        return humanYears;
    }

}
