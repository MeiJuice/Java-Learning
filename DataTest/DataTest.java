public class DataTest {
    public static void main(String[] agrs) {
        DataClass dc = new DataClass();

        System.out.println(dc.name);
        System.out.println(dc.b+ dc.c);
        //如果在输出格式中，是数+数，那么输出的是两个数相加
        //如果是不同类型，那么就是直接输出
        System.out.println(dc.a + dc.a);
        //System.out.println(dc.URL);

        System.out.println(DataClass.a);
        //System.out.println(DataClass.URL);
    }
}