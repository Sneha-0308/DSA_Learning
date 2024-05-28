package org.example.recursion;

public class PowerOfAn {
    public static void main(String[] args){
        int a=2;
        int n=4;
        System.out.println(pow(a,n));
    }

    //>>>>TODO: time complexity =O(N)
//    public static int pow(int a,int n){//1.faith
//        //3.base condition
//        if(n==1){
//            return a;
//        }
//        //2.main logic
//        int temp =pow(a,n-1);
//        return temp*a;
//    }

    //>>>>TODO: time complexity =O(logN)
    public static int pow(int a,int n){//1.faith
        //3.base condition
        if(n==1){
            return a;
        }
        //2.main logic
        int temp=pow(a,n/2);
        if(n%2==0){
            return temp*temp;
        }else {
            return temp*temp*a;
        }
    }
}
