package com.Chokealot.Labb2.jUnit;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        TextProcessor tp = new TextProcessor();

        String testUpper = "HEJSAN";
        String testLower = "hejsan";
        String testReversed = "Hejsan";

        System.out.println(tp.lowerCase(testUpper));
        System.out.println(tp.upperCase(testLower));
        System.out.println(tp.reverseString(testReversed));

    }
}
