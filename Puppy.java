/**
 * ��������ʵ��
@author MeiJuice
@version v1,0
*/
public class Puppy {
    public Puppy(String name) {
        //���������ֻ��һ��������name
        System.out.println("С����������" + name);
    }

    public static void main(String[] args) {
        //�������佫����һ��Puppy����
        Puppy myPuppy = new Puppy("tommy");
        System.out.println(myPuppy);
    }
}
/*
1.һ���ļ������ж��class�������࣬����ֻ����һ������Ϊpublic������������
2.�������public����ֻ�ܺ��ļ�������һ��
3.���п���������������main���������ʽ�ǹ̶��ģ�
4.public static void main(String[] agrs){}
5.main()�����ǳ������ڣ��������ǳ����ִ�в���
6.ִ�г��򣺱��룺javac.exe����->��������.class�ֽ����ļ�->java.exe����

*/