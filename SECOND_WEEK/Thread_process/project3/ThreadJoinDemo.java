package Thread_process.project3;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1=new ThreadJoin();
        ThreadJoin tj2=new ThreadJoin();
        ThreadJoin tj3=new ThreadJoin();

        tj1.setName("猴子");
        tj2.setName("猪");
        tj3.setName("光头");
        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tj2.start();
        tj3.start();
    }
}
