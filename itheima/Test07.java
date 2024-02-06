package com.itheima;
//数组的翻转
public class Test07 {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        for (int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.println("[");
        for (int x=0;x<arr.length;x++){
            if (x==arr.length-1){
                System.out.println(arr[x]);
            }else {
                System.out.println(arr[x]+",");
            }
        }
    }
}
