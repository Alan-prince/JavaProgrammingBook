public class ContinueDemo {
    public static void main(String[] args) {
        int a, b, c;       // �ֱ��Ű١�ʮ����λ��
        System.out.print("���е�ˮ�ɻ�����");
        for (int n = 100; n < 1000; n++) {    // ���
            c = n % 10;                            // ��λ
            b = n / 10 % 10;                      // ʮλ
            a = n / 100;// ��λ
            if (a * a * a + b * b * b + c * c * c != n) { // �������
                continue;     // ֱ����̽��һ���� (�Թ�����֮���ѭ����) 
            }
            // ��������ѭ���塣��ִ�е����У�˵��ǰ���if���������� (�����)��
            System.out.print(n + "  ");
        }
    }
}
