package com.recursion.examples;

public class ReverseOfStringUsingRecursion {
//    Sum of array elements using recursion
    public static String reverseOfStringUsingRecursion(String values,int length){
        System.out.println("reverseOfStringUsingRecursion length: "+length);
        if (length<=0){
            return "";
        }
        String  result = values.charAt(length-1)+reverseOfStringUsingRecursion(values,length-1);
        System.out.println("reverseOfStringUsingRecursion result: "+result);
        return result;
    }
}
