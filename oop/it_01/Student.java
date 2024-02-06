package oop.it_01;
//不能run，学习static
public class Student {
    //非静态成员变量
    private String name="傻fufu";
    //静态成员变量
    private static String university="家里蹲大学";
    //非静态成员方法
    public void show1(){

    }
    //非静态成员方法
    public void show2(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }
    //静态成员方法
    public static void show3(){

    }
    //静态成员方法
    public static void show4(){
        System.out.println(university);
        show3();
    }
}
