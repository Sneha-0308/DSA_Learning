package org.example.recursion;


import java.util.ArrayList;

public class NumberSubset {
    public static void main(String[] args){
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

//       subsetNum(nums,"",0);
       response(nums);
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
//    public static ArrayList<ArrayList<Integer>>  response(ArrayList<Integer> nums){//faith
//
//        if(0<nums.size()){
//
//        }
//        //main logic
//        subsetNum(nums, result+nums[index],index+1);//take
//        subsetNum(nums,result,index+1);//not take
//
//    }
}
