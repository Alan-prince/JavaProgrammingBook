package ch05;

public class FinalAndStaticDemo {
    static final int MIN = 1; // static������final���ʹ��
    final static int MAX = 10; // static��final��˳����Խ���
    int m; // ʵ���ֶ�(��ƶ����ֶ�)��ÿ�������ʵ���ֶζ��ж������ڴ�ռ䣬�˴˻���Ӱ�졣
    static int n = 5; // ��̬�ֶ�(������ֶ�)�������ж�����
    private static FinalAndStaticDemo demo1; // ˽�о�̬�ֶ�

    /**** ��̬����(λ�ڷ�����) ****/
    static {
        System.out.print("ִ�о�̬����1��");
        demo1 = new FinalAndStaticDemo(10); // ��̬�����п��Ե��ù��췽��
    }

    FinalAndStaticDemo(int m) { // ���췽��
        this.m = m;
    }

    private void m1() { // ʵ������(��ƶ��󷽷�)
        System.out.print("ִ�з���m1��");
        m2(); // �Ǿ�̬�����п��Է��ʾ�̬�������ֶ�
        m3(); // �Ǿ�̬�����п��Է��ʷǾ�̬�������ֶ�
    }

    private static void m2() { // ��̬����(����෽��)
        System.out.print("ִ�з���m2��");
    }

    private void m3() { // ʵ������
        System.out.print("ִ�з���m3��");
        final FinalAndStaticDemo d = new FinalAndStaticDemo(5); // final����
        // d = new FinalAndStaticDemo(5); // �﷨����(�����޸�final����d)
        d.m = 40; // �������޸�dָ�������ֶ�
    }

    /**** main�������Ǿ�̬�ģ��Ա���������贴��������ܵ��ø÷����������� ****/
    public static void main(String[] args) {
        m2(); // ��̬�����п��Է��ʾ�̬�������ֶ�

        FinalAndStaticDemo demo2 = new FinalAndStaticDemo(20);
        demo2.m1(); // ��̬�����в���ֱ�ӷ��ʷǾ�̬�������ֶΣ�����ͨ������
        demo2.m2(); // ����ͨ��������ʾ�̬�������ֶ�(�����Ƽ�)

        demo1.m = demo1.m + 1; // �޸�ʵ���ֶ�(����Ӱ����������)
        System.out.print("\ndemo1.m=" + demo1.m + "\t"); // ��ӡ11
        System.out.println("demo2.m=" + demo2.m); // ��ӡ20

        demo1.n = demo1.n + 1; // �޸����ֶ�(��Ӱ����������)
        System.out.print("demo1.n=" + demo1.n + "\t"); // ��ӡ6
        System.out.println("demo2.n=" + demo2.n); // ��ӡ6
    }

    /**** ����԰��������̬���飬����ִ�� ****/
    static {
        System.out.print("ִ�о�̬����2��\n");
    }
}