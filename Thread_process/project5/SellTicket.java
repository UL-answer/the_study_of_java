package Thread_process.project5;

public class SellTicket implements Runnable{
    private int ticket=100;
    public void run(){
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
