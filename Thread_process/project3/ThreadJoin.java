package Thread_process.project3;

public class ThreadJoin extends Thread{

        public void run() {
            for (int i=0;i<100;i++){
                System.out.println(getName()+":"+i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        }

