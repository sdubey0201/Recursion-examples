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
    public  static int sumOfArrayElementUsingTailRecursion(int [] element,int length,int sum){
        if (length<=0){
            return sum;
        }
        sum = sum+element[length-1]+sumOfArrayElementUsingTailRecursion(element,length-1,sum);
        return sum;
    }
}
