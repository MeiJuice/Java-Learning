/*代码块局部变量
代码块局部变量常用于 try catch 代码块中，成为异常处理参数变量。
异常处理参数变量的作用域是在异常处理块中，该变量是将异常处理参数传递给异常处理块，与方法参数变量类似。*/
public class printStackTrace {
    public static void test() {
        try {
            System.out.println("Hello!Exception!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] agrs) {
        test();
    }
}