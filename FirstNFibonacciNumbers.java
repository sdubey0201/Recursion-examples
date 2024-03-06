package com.recursion.examples;

public class FirstNFibonacciNumbers {
//    Prog/ram to print first n Fibonacci Numbers
    public static void showFirstNFibonacciNumbers(int first,int second,int number){
        if (number ==0){
            return;
        }
        int third = first+second;
//        System.out.print(first+" ");
//        System.out.print(second+" ");
        System.out.print(third+" ");
        showFirstNFibonacciNumbers(second,third,number-1);
    }
    public static int getNthFibonacciNumber(int number){
        System.out.println("Number :"+number);
        if (number ==0){
            return 0;
        }
        else if (number == 1){
            return 1;
        }else {

           return getNthFibonacciNumber(number-2)+getNthFibonacciNumber(number-1);
//            System.out.println("a :"+a);
//            return a;
        }


    }
}
