import java.util.Scanner;   // ����Scanner�๩������ʹ�ã��������6�¡�

public class BreakDemo {
    public static void main(String[] args) {
        // ��������������Է������������ʱ���������ݣ��������11�¡�
        Scanner scanner = new Scanner(System.in);
        int n;         // ���ж��Ƿ�Ϊ��������
        int i = 2;    // ������2��ʼ
        System.out.print("������һ��������");    // ��ӡ��ʾ����
        n = scanner.nextInt();    // �ȴ���������һ��int�����ݲ���ֵ��n
        for (; i < n; i++) {       // ��2~n-1��һ��̽ (����ٷ�) 
            if (n % i == 0) {      // ��ĳ���ܳ���
                System.out.println(n + "����������");
                break;    // �������ڵ�for��� (�����ٳ�)��������19�м���ִ�С�
            }
        }
        // ��i���ӵ���n��˵��ǰ���for������ɵ�2�����ʽ (i<n) ������
        // �������ģ���2~n-1�����ܽ�n��������n��������
        if (i == n) {
            System.out.println(n + "��������");
        }
    }
}
