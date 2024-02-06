package com.itheima;
//数组的比较
public class Tset05 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};
        boolean flag=compare(arr,arr2);
        System.out.println(flag);
    }
        public static boolean compare(int[] arr,int[] arr2){
            if(arr.length!= arr2.length){
                return false;
            }
            return true;
    }
}
