package oop.it_03;

public class Pingpang extends Coach implements SpeakEnglish{
    public Pingpang() {
    }

    public Pingpang(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach() {
        System.out.println("乒乓球教教练发球和接球");
    }
    public void eat(){
        System.out.println("乒乓球教练吃小白菜喝大米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练教说英语");
    }
}
