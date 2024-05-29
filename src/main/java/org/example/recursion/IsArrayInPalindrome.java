package org.example.recursion;

import java.util.Arrays;

public class IsArrayInPalindrome {
    public static void main(String[] args){
        char[] arr={'m','a','l','a','y','a','l','a','m'};
        System.out.println(palindrome(arr,0,arr.length-1));
    }
    public static boolean palindrome(char[] arr,int s,int e){ //faith

        //base condition
        if(s==e || s>e){
            return true;
        }
        //main logic
        if(arr[s]==arr[e]){
            boolean temp=palindrome(arr,s+1,e-1);
            return temp;
        }else {
            return false;
        }
    }
}
