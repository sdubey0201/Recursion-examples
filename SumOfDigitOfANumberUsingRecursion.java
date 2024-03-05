package com.recursion.examples;

public class SumOfDigitOfANumberUsingRecursion {

    public static int getSumOfDigitOfANumberUsingRecursion(int number){
        System.out.println("getSumOfDigitOfANumberUsingRecursion");
        System.out.println("Number : "+number);
        if (number ==0){
            return 0;
        }
        int a = number%10;
        int b = number/10;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        return a+getSumOfDigitOfANumberUsingRecursion(b);
    }
}
