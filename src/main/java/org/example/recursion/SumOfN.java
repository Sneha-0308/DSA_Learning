package org.example.recursion;

public class SumOfN {
    public static void main(String[] args){
        int sum=sum(4);
        System.out.println(sum);
    }
    public static int sum(int n){ //TODO: STEP1: faith creating function which is returning sum assuming

        //TODO: STEP3: base condition that is get solution of smallest sub problem which you will be knowing
        if (n==1){
            return 1;
        }

        //TODO: STEP2: main logic solving problem into sub problem
        int temp = sum(n-1);
        return temp+n;
    }
}
