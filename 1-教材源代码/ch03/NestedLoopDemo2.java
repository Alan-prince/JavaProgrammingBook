import java.util.Scanner;

public class NestedLoopDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;        // ��������
        int i = 2;   // ���Ӵ�2��ʼ
        System.out.print("������һ��������");
        n = scanner.nextInt();
        System.out.print(n + " = ");
        while (n > 1) {        // ������һ�������Ӻ�n���Գ�����1��
            if (n % i == 0) {  // �ж�i�Ƿ���n������
                int j = 2;
                for (; j < i; j++) {   // �ж�i�Ƿ�������
                    if (i % j == 0) {
                        break;            // ����for��� (������19�м���ִ��) 
                    }
                } // for����
                if (j == i) {            // ��������i������
                    System.out.print(i + "*");   // ��ӡ������i
                    n /= i;         // ÿ���һ�������ӣ���n�Գ��������ӡ�
                    i = 2;          // ���һ�������Ӻ��´μ�����2��ʼ��̽��
                }
            } else {
                i++;     // i����n�����ӣ�������̽��һ������
            }
        } // while����
        System.out.print("\b ");   // Ĩȥ���һ��*�ַ� (ע��\b����һ���ո�) 
    }
}
