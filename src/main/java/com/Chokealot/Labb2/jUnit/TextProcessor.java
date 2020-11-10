package com.Chokealot.Labb2.jUnit;

public class TextProcessor {

    public String upperCase(String str) {
        return str.toUpperCase();
    }

    public String lowerCase(String str) {
        return str.toLowerCase();
    }

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
