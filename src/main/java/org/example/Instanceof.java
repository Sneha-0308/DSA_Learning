package org.example;

public class Instanceof {
    public static void main(String[] args) {
        Object obj="Hello";
        if (obj instanceof String) {
            String s = (String) obj; // manual casting
            System.out.println(s.toUpperCase());
        }
        //java 16+
        if (obj instanceof String s) {   // check + cast in one line
            System.out.println(s.toUpperCase());  // directly use 's'
        }
    }
}
