package com.itheima;

import java.util.Scanner;
//查找索引
public class Test06 {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查找的数据");
        int number =sc.nextInt();
//        int index=-1;
//        for (int x=0;x<arr.length;x++){
//            if (arr[x]==number){
//                index=x;
//                break;
//            }
//        }
        int index=getIndex(arr,number);
        System.out.println("index:"+index);
    }
    //查找指定的数据在数组中的索引
    public static int getIndex(int[] arr,int number){
        int index=-1;
        for (int x=0;x<arr.length;x++){
            if (arr[x]==number){
                index=x;
                break;
            }
        }
        return index;
    }
}
