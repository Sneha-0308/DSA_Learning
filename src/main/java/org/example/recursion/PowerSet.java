package org.example.recursion;

import java.util.List;

public class PowerSet {
    public static void main(String[] args){
        String str="abc";
        subSequence(str,"",0);
    }
    public static void subSequence(String str,String tempAns,int index){//faith
        //base condition
        if(str.length()==index){
            System.out.println(tempAns);
            return;
        }
        //main logic
        //take
        subSequence(str,tempAns+str.charAt(index),index+1);
        //not take
        subSequence(str,tempAns,index+1);
        return;
    }
}
