package com.company;

public class ReverseSentence {

    public static void main(String[] args) {
        String s = "Let's reverse this sentence", ns = "";
        char ch;

        System.out.print("Original sentence: ");
        System.out.println("Let's reverse this sentence");

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            ns = ch + ns;
        }
        System.out.println("Reversed sentence: " + ns);
    }
}
