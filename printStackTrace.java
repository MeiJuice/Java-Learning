/*�����ֲ�����
�����ֲ����������� try catch ������У���Ϊ�쳣�������������
�쳣������������������������쳣������У��ñ����ǽ��쳣����������ݸ��쳣����飬�뷽�������������ơ�*/
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