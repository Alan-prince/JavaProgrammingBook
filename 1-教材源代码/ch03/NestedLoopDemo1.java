public class NestedLoopDemo1 {
    public static void main(String[] args) {
        int a, b, c;       // �ֱ��Ŵ��С�С���ƥ��
        System.out.println("����\t����\tС��");
        System.out.println("--------------------");
        for (a = 0; a <= 33; a++) {     // ��� (�������33ƥ) 
            for (b = 0; b <= 50; b++) {     // �������50ƥ
                c = 100 - a - b;               // ����С��ƥ��
                // ������100�� (ע��c/2����������Ӧ����c��2�ı���������) 
                if (3 * a + 2 * b + c / 2 == 100 && c % 2 == 0) {
                    System.out.println(a + "\t" + b + "\t" + c);
                }  // if������
            }  // �ڲ�for������
        }  // ���for������
    }
}
