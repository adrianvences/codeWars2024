package com.pluralsight.codeWarsPractice;

public class sumOfNumbers3 {

    public int GetSum(int a, int b)
    {
        if (a == b){
            return a;
        } else {
            int num = 0;
            int start = Math.min(a,b);
            int end = Math.max(a,b);
            for(int i = start; i <= end; i++){
                num += i;
            }
            return num;
        }
    }

}
