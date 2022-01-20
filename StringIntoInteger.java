package com.company;
import java.io.*;
import java.util.Arrays;

public class StringIntoInteger {
    public static void main(String[] args){
        String s = "85,24,35,56,58";
        String[] str = s.split(",");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++)
            arr[i] = Integer.valueOf(str[i]);

        System.out.println("String : "+ s);
        System.out.println("Converted Array: "+ Arrays.toString(arr));

    }
}