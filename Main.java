package com.recursion.examples;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        reverseStringUsingRecursion();
//        System.out.println(reverseStringRecursiveApproach2("Education"));
//        System.out.println("Using Approach 3");
//        printReverseStringUsingRecursion("Communication");
        printNumberSequenceUsingRecursion(5);

    }
    private static void reverseStringUsingRecursion(){
        String input = "Education";
        String result = "";
        int index = input.length()-1;
        result = reverseString(input,result,index);
        System.out.println(result);

    }
    private static String reverseString(String input,String result,int index){
          while (input.length() != result.length()){
              result+=input.charAt(index);
              index--;
              reverseString(input,result,index);
          }
          return result;
    }
    // approach 2
    private static  String reverseStringRecursiveApproach2(String input){
        if (null == input || input.length()<=1){
            return input;
        }
       return reverseStringRecursiveApproach2(input.substring(1))+input.charAt(0);
    }

    // approach 3
    private  static  void  printReverseStringUsingRecursion(String input){
        if (Objects.isNull(input) || input.length()<=1){
            System.out.print(input);
        }else {
            char c = input.charAt(input.length()-1);
            System.out.print(c);
            printReverseStringUsingRecursion(input.substring(0,input.length()-1));
        }

    }

    private static void printNumberSequenceUsingRecursion(int N){
        if (N==1){
            System.out.print(" "+N);
        }else {
            System.out.print(N+" ");
            printNumberSequenceUsingRecursion(N-1);

        }

    }
}


