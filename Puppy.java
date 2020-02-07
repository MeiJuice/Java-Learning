/**
 * 创建对象实例
@author MeiJuice
@version v1,0
*/
public class Puppy {
    public Puppy(String name) {
        //这个构造器只有一个参数：name
        System.out.println("小狗的名字是" + name);
    }

    public static void main(String[] args) {
        //下面的语句将创建一个Puppy对象
        Puppy myPuppy = new Puppy("tommy");
        System.out.println(myPuppy);
    }
}
/*
1.一个文件可以有多个class声明的类，但是只能有一个声明为public（公共）的类
2.而且这个public的类只能和文件的名字一致
3.类中可以有主方法，即main方法，其格式是固定的：
4.public static void main(String[] agrs){}
5.main()方法是程序的入口，方法内是程序的执行部分
6.执行程序：编译：javac.exe编译->生成诸多个.class字节码文件->java.exe运行

*/