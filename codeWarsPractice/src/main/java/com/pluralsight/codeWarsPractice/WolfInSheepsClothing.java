package com.pluralsight.codeWarsPractice;

public class WolfInSheepsClothing {
    public static String warnTheSheep (String[] array ) {
        // we need to go through the array backwards
        // tell the index that is infront of the wolf that he is about to be eaten.
        // if the wolf is the last index tell it to go away.
        //
        int wolf = -1;
        for (int i = 0; i < array.length;i++){

            if(array[array.length - 1].equals("wolf")){
                System.out.println("Pls go away and stop eating my sheep");
            }


        }
        return "done";
    }
}
