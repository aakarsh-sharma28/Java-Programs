package com.company;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Reverse this string", ns = "";
        char ch;

        System.out.print("Initial String: ");
        System.out.println("Reverse this string");

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            ns = ch + ns;
        }
        System.out.println("Reversed word: " + ns);
    }
}
