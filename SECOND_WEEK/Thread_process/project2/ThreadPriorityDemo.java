package Thread_process.project2;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1=new ThreadPriority();
        ThreadPriority tp2=new ThreadPriority();
        ThreadPriority tp3=new ThreadPriority();
        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");
//        tp1.start();
//        tp2.start();
//        tp3.start();
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);
        tp1.start();
        tp2.start();
        tp3.start();
    }
}
