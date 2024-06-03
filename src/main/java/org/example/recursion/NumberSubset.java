package org.example.recursion;


import java.util.ArrayList;

public class NumberSubset {
    public static void main(String[] args){
        int[] nums={1,2,3};

       subsetNum(nums,"",0);

    }
    public static void subsetNum(int[] nums,String result,int index){//faith

        if(index==nums.length){
            System.out.println(result);
            return;
        }
        //main logic
        subsetNum(nums, result+nums[index],index+1);//take
        subsetNum(nums,result,index+1);//not take

    }

}
