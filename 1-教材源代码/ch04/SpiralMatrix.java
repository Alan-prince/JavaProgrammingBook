public class SpiralMatrix {
    public static void main(String[] args) {
        final int ROWS = 10;    // ����Ľ���
        int start = 1;    // ���Ͻǵ���ʼֵ
        int a[][] = new int[ROWS][ROWS];   // ���� (ȫ��Ԫ�ؾ�Ϊ0) 
        char direction = 'R';   // ��ʼ����Ϊ��
        int i = 0, j = 0;    // ��ʼ���������±�
        while (a[i][j] == 0) {
            a[i][j] = start++;     // ��������
            switch (direction) {   // ���ݷ����ж���һ����λ��
                case 'R':    // ��
                    if (j + 1 < ROWS && a[i][j + 1] == 0)// δ�ߵ�������δ�߹�
                        j++;  // ������
                    else {    // �ߵ����Ҷ˻����߹�
                        i++;  // ��ת
                        direction = 'D';  // �޸ķ���
                    }
                    break;
                case 'D':    // ��
                    if (i + 1 < ROWS && a[i + 1][j] == 0)// δ�ߵ�������δ�߹�
                        i++;
                    else {
                        j--;  // ��ת
                        direction = 'L';
                    }
                    break;
                case 'L':    // ��
                    if (j > 0 && a[i][j - 1] == 0)
                        j--;
                    else {
                        i--;  // ��ת
                        direction = 'U';
                    }
                    break;
                case 'U':    // ��
                    if (i > 0 && a[i - 1][j] == 0)
                        i--;
                    else {
                        j++;  // ��ת
                        direction = 'R';
                    }
            } // switch����
        } // while����
        for (int m = 0; m < ROWS; m++) {   // ��ӡ����
            for (int n = 0; n < ROWS; n++) {
                System.out.printf("%-4d", a[m][n]);
            }
            System.out.println();
        }
    }
}
