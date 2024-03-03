package com.recursion.examples;

import java.util.Objects;

public class LengthOfAStringUsingRecursion {

    public static int lengthOfStringUsingRecursion(String input){
        if (Objects.equals(input, "")){
            return 0;
        }
        return lengthOfStringUsingRecursion(input.substring(1))+1;
    }
}
