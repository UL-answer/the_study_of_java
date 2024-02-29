package Exception02;

public class Exception02Demo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method() {
        try {
            int[] arr = {1, 2, 4};
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
