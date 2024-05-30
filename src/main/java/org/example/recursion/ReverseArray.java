package org.example.recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,4};
        System.out.println(Arrays.toString(reverse(arr,0,arr.length-1)));
    }
    public static int[] reverse(int arr[],int s,int e){ //1.faith
        //3.base condition
        if(s>=e){
            return arr;
        }
        //2.main logic
        int temp =arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        return reverse(arr,s+1,e-1);
    }
}
