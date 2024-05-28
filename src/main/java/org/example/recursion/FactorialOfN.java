package org.example.recursion;

public class FactorialOfN {
    public static void main(String[] args){
        int n=4;
        System.out.println(fact(n));
    }
    public static int fact(int n){// 1.faith
        //3.base condition
        if(n==1){
            return 1;
        }

        //2.main logic
        int temp = fact(n-1);
        return temp*n;
    }
}
