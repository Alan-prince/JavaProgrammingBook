public class MethodDemo {
    static void doNothing() { // �������κ�ֵ���ҷ�����Ϊ�ա�
    }

    public static void main(String[] args) { // ��ڷ���
        int a = 2, b = 4, c = 6;
        long max;

        // ֱ�ӵ���λ��main֮��ķ������������ý����Ϊ���ʽ��һ���֡�
        max = getMax(a, b); // a��bΪʵ�� (b��ֵ�ᱻ�Զ�תΪlong��)
        System.out.print("max(a, b)=" + max + "   ");
        max = getMax(a * b, b); // ���ʽ��Ϊʵ��
        System.out.print("max(a*b, b)=" + max + "   ");

        // ����������Ϊʵ�Σ���getMax�ĵ�һ���β�Ҫ����int�ͣ�
        // ����Ӧ��ʵ����long�ͣ�ϵͳ�޷��Զ�ת��������Ҫǿ��ת����
        max = getMax((int) getMax(a, b * b), 8 + c);
        System.out.print("max(a, b*b, 8+c)=" + max);
        doNothing(); // �����޲η���
    }

    static long getMax(int a, long b) { // ��������
        if (a > b) {
            return (a); // ����getMax����������a��ֵ���أ��ȼ��� return a;
        }
        return b; // ȷ��ÿ����֧������ֵ����˼������Ϊ�ο��Բ�����else�ṹ�У�
    }
}
