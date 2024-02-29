package Thread_process.project4;

public class MyRunnableDemo{
    public static void main(String[] args) {
        MyRunnable my=new MyRunnable();
        Thread t1=new Thread(my,"高铁");
        Thread t2=new Thread(my,"飞机");
        t1.start();
        t2.start();
    }
}
