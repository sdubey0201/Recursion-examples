package com.recursion.examples;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        reverseStringUsingRecursion();
//        System.out.println(reverseStringRecursiveApproach2("Education"));
//        System.out.println("Using Approach 3");
//        printReverseStringUsingRecursion("Communication");
//        printNumberSequenceUsingRecursion(10);
//        printNumberSequenceUsingRecursionReverse(10);
//        int value [] ={1,2,3,4,5};
//        int index = value.length-1 ;
//        int sum = 0;
//        System.out.println(meanOfArrayUsingRecursion(value,index,sum));
//        findMean();
//        System.out.println(sumOfNaturalNumbersUsingRecursion(5));
//        System.out.println(decimal_to_binary(10));
        showSumOfArrayElement();

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
        if (N>=1){
            printNumberSequenceUsingRecursion(N-1);
            System.out.print(" "+N);
        }
        return;

    }
    private static void printNumberSequenceUsingRecursionReverse(int N){
        if (N>1){
            System.out.print(" "+N);
            printNumberSequenceUsingRecursionReverse(N-1);
        }else {
            System.out.print(" "+N);
        }


    }

    private static float meanOfArrayUsingRecursion(int [] values,int index, int sum){


           if (index>=0){
               sum = sum+values[index];
              return meanOfArrayUsingRecursion(values,index-1,sum);
           }else {
               return (float) sum/values.length;
           }

//
//           if (index <=0){
//               sum = sum+values[0];
//               System.out.println("mean is "+(sum/values.length));
//           }else {
//
//           }

    }

    private static void findMean(){
        float Mean = 0;
        int A[] = {1, 2, 3, 4, 5};
        int N = A.length;
        System.out.println(findMean(A,N));
    }
    private static float findMean(int [] value,int n) {
       if (n == 1){
           return (float) value[n-1];
       }else {
           return (float) (findMean(value,n-1)*n-1+value[n-1])/n;
       }
    }

//    Input : 3
//    Output : 6
//    Explanation : 1 + 2 + 3 = 6
//
//    Input : 5
//    Output : 15
//    Explanation : 1 + 2 + 3 + 4 + 5 = 15
    private  static  int sumOfNaturalNumbersUsingRecursion(int n){
        if (n==1){
            return n;
        }
        else {
           return n+sumOfNaturalNumbersUsingRecursion(n-1);
        }
    }

//    Java Program for Decimal to Binary Conversion

    private static int decimal_to_binary(int values){
        if (values ==0){
            return 0;
        }else {
            int  a = values%2;
            System.out.println("a: "+a);
            int b = values/2;
            System.out.println("b: "+b);
            int c = a+10*decimal_to_binary(b);
            System.out.println("c: "+c);
            return c;
        }
    }

    private static void showSumOfArrayElement(){
        int[] element = {1, 2, 3};
        int length = element.length;
        System.out.println(SumOfArrayElementsUsingRecursion.sumOfArrayUsingRecursion(element,length));
    }
    
}


