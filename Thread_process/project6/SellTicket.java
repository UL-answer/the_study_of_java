package Thread_process.project6;

public class SellTicket implements Runnable{
    private int ticket=100;

    @Override
    public void run() {
        while(true){
            synchronized (new Object()){
                if(ticket>0){
                    if (ticket>0){
                        try {
                            Thread.sleep(100);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"张票");
                    ticket--;
                    }
                    }
                }
        }
    }
}
