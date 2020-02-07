public class constant {
    public static final double pi = 3.14;
    /*静态常量使用在 final 之前 public static 修饰。
    public static 修饰的常量作用域是全局的，不需要创建对象就可以访问它，
    在类外部访问形式为 value. PI。这种常量在编程中使用很多。*/
    final int y = 10;
    //声明成员变量,作用域类似于成员变量，但不能修改。

    public static void main(String[] args) {
        final double x = 3.3;
        //声明局部变量，作用域类似于局部变量，但不能修改。
        System.out.println(x);
    }
}
/*在定义常量时，需要注意如下内容：
在定义常量时就需要对该常量进行初始化。
final 关键字不仅可以用来修饰基本数据类型的常量，还可以用来修饰对象的引用或者方法。
为了与变量区别，常量取名一般都用大写字符。

当常量被设定后，一般情况下不允许再进行更改，如果更改其值将提示错误。
定义常量 AGE 并赋予初值，如果更改 AGE 的值，那么在编译时将提示不能重合赋值错误。*/