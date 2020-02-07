public class YangHuiTriangle {
    public static void main(String[] args) {
        final int N = 10;    // ����
        int[][] a = new int[N][];   // ʡ�������� (��ÿ��������ͬ) 
        for (int i = 0; i < a.length; i++) {   // ѭ��N��
            a[i] = new int[i + 1];   // ��i�� (��0��ʼ) ��i+1��
            a[i][0] = 1;    // ÿ�е�һ��Ϊ1
            a[i][a[i].length - 1] = 1;  // ÿ�����һ��Ϊ1 (��дΪa[i][i]=1) 
        }
        for (int i = 2; i < a.length; i++) {   // �ӵ�3�п�ʼΪԪ�ظ�ֵ
            // �ӵ�2�п�ʼΪԪ�ظ�ֵ (���������һ��) 
            for (int j = 1; j < a[i].length - 1; j++) {
                a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
            }
        }
        for (int i = 0; i < a.length; i++) {  // ��ӡN��
            for (int j = 0; j < a[i].length; j++) {    // ��ӡ��i��
                System.out.printf("%-4d", a[i][j]);   // ��ӡԪ��
            }
            System.out.println();  // ÿ��ӡһ�л��� (�������for) 
        }
    }
}
