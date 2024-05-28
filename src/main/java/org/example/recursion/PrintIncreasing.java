package org.example.recursion;

public class PrintIncreasing {

    public static void main(String[] args){
        int n=5;
        printing(n);
    }
    public static void printing(int n){// faith
        //base condition
        if(n==1){
            System.out.print(n);
            return;
        }
       // 2.main logic
        printing(n-1);
        System.out.print(n);
    }
}
