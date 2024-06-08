package org.example.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    static List<int[]> ll=new ArrayList<>();

    public static void main(String[] args) {
        int[] arr={1,2,3};
        permu(arr,0);
        for(int[] a:ll){
            System.out.println(Arrays.toString(a));
        }
    }
    public static void permu(int[] arr,int index){
        if(index==arr.length){
            ll.add(arr.clone());
            return;
        }

        for(int i=index;i<arr.length;i++){
            swap(arr,index,i);
            permu(arr,index+1);
            swap(arr,index,i);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int a=arr[i];
        arr[i]=arr[j];
        arr[j]=a;
    }
}
