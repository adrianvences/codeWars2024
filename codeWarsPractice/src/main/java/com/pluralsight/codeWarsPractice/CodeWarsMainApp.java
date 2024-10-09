package com.pluralsight.codeWarsPractice;

import java.util.Arrays;

public class CodeWarsMainApp {
    public static void main(String[] args) {
//        WolfInSheepsClothing.warnTheSheep(new String[]{"sheep","wolf","sheep","wolf"});

        int[] result = DogCatYears.ownedCatAndDog(84,20);
        System.out.println(Arrays.toString(result));

    }
}
