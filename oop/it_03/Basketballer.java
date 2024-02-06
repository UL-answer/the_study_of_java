package oop.it_03;

public class Basketballer extends Player{
    public Basketballer() {
    }

    public Basketballer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉喝牛奶");
    }
}
