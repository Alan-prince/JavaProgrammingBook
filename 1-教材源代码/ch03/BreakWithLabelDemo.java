public class BreakWithLabelDemo {
    public static void main(String args[]) {
        final int LIMIT = 40;                      // �Ǻ�������
        int i = 1, j;
        int total = 0;                              // �Ѵ�ӡ���Ǻ���
        OUTTER: while (true) { // ���ѭ�� (���˱��) 
            for (j = 1; j <= 2 * i - 1; j++) { // �ڲ�ѭ��
                System.out.print("*");
                if (++total == LIMIT) {          // ��������
                    // �������ѭ�� (ע���������ڲ�ѭ������) 
                    break OUTTER;
                }
            }
            System.out.println();                // ����
            i++;
        }
    }
}
