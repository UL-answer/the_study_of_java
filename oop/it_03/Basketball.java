package oop.it_03;

public class Basketball extends Coach{
    @Override
    public void teach() {
        System.out.println("篮球教练教运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊腿，喝羊奶");
    }

    public Basketball() {
    }

    public Basketball(String name, int age) {
        super(name, age);
    }
}
