package org.example.recursion;

import java.util.ArrayList;

public class SubsetSum {
    public static void main(String[] args){
        int[] nums={3, 34, 4, 12, 5, 2};
        setSum(nums,"",30,0);
    }
    public static void setSum(int[] nums,String temp,int sum,int index){//faith

        //basic condition
        if(index==nums.length){
            if(add(temp.split(","))==sum){
                System.out.println(temp);
            }
            return;
        }
        //main logic


        setSum(nums,temp+","+nums[index],sum,index+1);//take
        setSum(nums,temp,sum,index+1);//not take

    }

    public static int add(String[] nums){
        int val=0;
        for(String n:nums){
            if(!n.isEmpty())
                val+=Integer.parseInt(n);
        }
        return val;
    }

}
