package org.example.recursion;

public class PrintNameNtimes {
//    space and time complexity is O(N)
    public static void main(String[] args) {
//        printName("sneha",0,5);
//        print1ton(1,5);
        printnto1(5);
    }
    public static void printName(String name,int i,int n){
        if(i==n){
            return;
        }
        System.out.println(name);
        printName(name,i+1,n);
    }
    public static void print1ton(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print1ton(i+1,n);
    }
    public static void printnto1(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printnto1(n-1);
    }
}
