/*DataType identifier=value;
上述语法代码中涉及 3 个内容：DataType、 identifier 和 value，其具体说明如下：
DataType：变量类型，如 int、string、 char 和 double 等。
identifier：标识符，也叫变量名称。
value：声明变量时的值。*/

/*变量标识符的命名规范如下：
首字符必须是字母、下划线（―）、美元符号（$）或者人民币符号（?）。
标识符由数字（0~9）、大写字母（A~Z）、小写字母（a~z）、下划线（―）、美元符号（$）、人民币符号（?）以及所有在十六进制 0xc0 前的 ASCII 码组成。
不能把关键字、保留字作为标识符。
标识符的长度没有限制。
标识符区分大小写。*/

public class variable {
    public static void main (String[] agrs){
        int value=13;
        System.out.println(value);
    }
}