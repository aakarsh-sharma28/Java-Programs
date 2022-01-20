package com.company;
import java.util.Arrays;

public class ArrayNegativeNumbers {
        public static void main(String[] args) {
            int[] arr = {25, -15, 44, -91, 83, 56, -89, 68, 26};
            Arrays.sort(arr);
            System.out.println("Negative One Side: " + Arrays.toString(arr));
        }
}
