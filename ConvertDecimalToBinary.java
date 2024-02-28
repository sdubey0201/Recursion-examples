package com.recursion.examples;

public class ConvertDecimalToBinary {
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
}
