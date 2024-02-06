package oop.it_02;
//测试类
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(7);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("______");
        a=new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
