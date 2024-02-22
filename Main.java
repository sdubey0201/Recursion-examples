package com.recursion.examples;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        reverseStringUsingRecursion();
        System.out.println(reverseStringRecursiveApproach2("Education"));
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
}

