package com.itheima;
//解方程问题
public class Test03 {
    public static void main(String[] args) {
        for(int x=0;x<=20;x++){
            for(int y=0;y<=33;y++){
                int z=100-x-y;
                //输出满足约束条件的解
                if(z%3==0&&5*x+3*y+z/3==100){
                    System.out.println(x+","+y+","+z);
                }

            }
        }
    }
}
