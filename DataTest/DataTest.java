public class DataTest {
    public static void main(String[] agrs) {
        DataClass dc = new DataClass();

        System.out.println(dc.name);
        System.out.println(dc.b+ dc.c);
        //����������ʽ�У�����+������ô����������������
        //����ǲ�ͬ���ͣ���ô����ֱ�����
        System.out.println(dc.a + dc.a);
        //System.out.println(dc.URL);

        System.out.println(DataClass.a);
        //System.out.println(DataClass.URL);
    }
}