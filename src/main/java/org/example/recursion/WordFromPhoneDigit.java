package org.example.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordFromPhoneDigit {
    static ArrayList<String> answer=new ArrayList<>();
    static String[] keys= {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};


    public static void main(String[] args){

        int[] arr={2,3};
        phoneDigit(arr,"",0);
        for(String ans:answer){
            System.out.println(ans);
        }
    }
    public static void phoneDigit(int[] arr,String temp, int index){
        //base condition
        if(index==arr.length){
            answer.add(temp);
            return;
        }
    //main logic
        for(int i=0;i<keys[arr[index]].length();i++){
            phoneDigit(arr,temp+keys[arr[index]].charAt(i),index+1 );
        }

    }
}
