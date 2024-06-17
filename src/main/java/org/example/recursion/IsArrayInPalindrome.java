package org.example.recursion;

import java.util.Arrays;

public class IsArrayInPalindrome {
    public static void main(String[] args){
        char[] arr={'m','a','l','a','y','a','l','a','m'};
//        char[] arr={'s','n','e','h','a'};
//        System.out.println(palindrome(arr,0,arr.length-1));
        System.out.println(palindrome1(arr,0));
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
    //using single pointer
    public static boolean palindrome1(char[] arr,int i){
        if(i>=arr.length/2)
            return true;
        if(arr[i]!=arr[arr.length-i-1]){
            return false;
        }
        return palindrome1(arr,i+1);
    }
}
