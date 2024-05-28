package org.example.recursion;

public class Fibonacci {
    public static void main(String[] args){
        int num=6;
        System.out.println(">result "+fib(num));
    }
    public static int fib(int n){//Faith
        //base condition
        if(n==0 || n==1){
            return n;
        }


        //main logic
        int temp1=fib(n-1);
        int temp2=fib(n-2);
        return temp1+temp2;
    }
}
