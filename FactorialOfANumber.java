package com.recursion.examples;

public class FactorialOfANumber {
    public static int  getFactorialOfANumber(int number ){
        System.out.println("Number : "+number);
            if (number ==1){
                return 1;
            }
        return number*getFactorialOfANumber(number-1);
    }
}
