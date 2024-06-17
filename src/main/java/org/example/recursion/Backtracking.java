package org.example.recursion;

public class Backtracking {
    public static void main(String[] args) {
//        print1ton(5);
        printnto1(1,5);
    }
    public static void print1ton(int n){
        if(n<1){
            return;
        }
        print1ton(n-1);
        System.out.println(n);
    }
    public static void printnto1(int i,int n){
        if(i>n){
            return;
        }
        printnto1(i+1,n);
        System.out.println(i);
    }

}
