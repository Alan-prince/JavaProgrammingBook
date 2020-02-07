import java.util.Random;

public class AccessArrayDemo {
    public static void main(String[] args) {
        Random random = new Random();    // �������������������
        int[] a = new int[16 + 1];       // �������� (ֻʹ�ú�16��Ԫ��) 
        int temp;      // ���ڽ�������ʱ����
        boolean exchanged;  // ÿ���������Ƿ�����Ԫ�ؽ���
        System.out.print("����ǰ�����飺");
        for (int i = 1; i < a.length; i++) {
            a[i] = random.nextInt(100);   // ����0~99��������� (���ܳ����ظ�) 
            System.out.printf("%-4d", a[i]);    // ��ӡԪ�أ�ÿ��ռ4�п�� (�����)
        }
        // N��Ԫ�ؽ���ð����������ִ��N-1�֡�
        for (int i = 1; i < a.length - 1; i++) {
            exchanged = false;      // ÿ������ǰ����ʼ��������־��
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {    // ����λ�õ�Ԫ�رȽ�
                    temp = a[j];          // �������С�򽻻�
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    exchanged = true;     // �����˽������޸Ľ�����־��
                }
            }
            if (exchanged == false) {  // ��δ�����κν��������ü�����һ�֡�
                break;  // �������forѭ��
            }
        }
        System.out.print("\n���������飺");
        for (int i = 1; i < a.length; i++) {  // ��ӡ����������
            System.out.printf("%-4d", a[i]);
        }
    }
}
