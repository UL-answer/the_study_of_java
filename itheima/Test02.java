package com.itheima;
//斐波那契数列小游戏
public class Test02 {
    public static void main(String[] args) {
        int[] arr=new int[20];
//        第一个月，第二个月兔子数
        arr[0]=1;
        arr[1]=1;
        for (int x=2;x<arr.length;x++){
            arr[x]=arr[x-2]+arr[x-1];
        }
        System.out.println("第二十个月兔子数："+arr[19]);
    }
}
