package oop.it_03;

public class Demo
{
    public static void main(String[] args) {
        Pingpang ppp=new Pingpang();
        ppp.setName("小炮");
        ppp.setAge(77);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.speak();
        System.out.println("------");
        Basketballer bp=new Basketballer();
        bp.setName("老炮");
        bp.setAge(66);
        System.out.println(bp.getName()+","+ bp.getAge());
        bp.eat();
        bp.study();
    }
}
