public class ForDemo {
    public static void main(String[] args) {
        int f1 = 1, f2 = 1;                // ���ڵ�����
        for (int i = 1; i <= 9; i++) {  // ѭ��9�� (ÿ��������) 
            // Ϊ��������ʹ���˸�ʽ����ӡ��������C���Ե�
            // printf�⺯�����ƣ��������14�¡�
            System.out.printf("F%-2d=%-8d", 2 * i - 1, f1);
            System.out.printf("F%-2d=%-8d", 2 * i, f2);
            if (i % 3 == 0) {        // ÿ��ӡ6���
                System.out.println();
            }
            f1 = f1 + f2;             // ������һ�� (���������в��ܽ���˳��) 
            f2 = f2 + f1;             // ����������һ��
        }
    }
}
