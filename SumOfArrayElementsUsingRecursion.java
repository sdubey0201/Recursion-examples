package com.recursion.examples;

public class SumOfArrayElementsUsingRecursion {
    public static int sumOfArrayUsingRecursion(int [] elements,int length){
        System.out.println("length : "+length);
        if (length<1){
            return 0;
        }
        int a = elements[length-1]+sumOfArrayUsingRecursion(elements,length-1);
        System.out.println("a : "+a);
        return a;

    }
}
