package ch05.singleton;

public class SingletonDemo { // ����ģʽ������
    public static void main(String[] args) {
        // �õ�������Ķ��� (g1��g2��g3��ʵ��ͬһ������Ĳ�ͬ����)
        God g1 = God.getInstance();
        God g2 = God.getInstance();
        God g3 = God.getInstance();

        // ��ӡg1��g2��g3ָ�������ڴ��ַ
        System.out.println("g1�ĵ�ַ: " + g1.hashCode());
        System.out.println("g2�ĵ�ַ: " + g2.hashCode());
        System.out.println("g3�ĵ�ַ: " + g3.hashCode());
    }
}
