import java.util.Scanner;

public class NestedLoopDemo3 {
    public static void main(String[] args) {
        int rows; // ������
        Scanner s = new Scanner(System.in);
        System.out.print("��������:");
        rows = s.nextInt();

        for (int i = -rows / 2; i <= rows / 2; i++) { // ��ִ��rows��
            // ��ӡ���׵����ɿո�
            System.out.printf("%" + (3 * Math.abs(i) + 1) + "s", " ");
            // ��ӡ��i�е���������
            for (int j = Math.abs(i) - rows / 2; j <= rows / 2 - Math.abs(i); j++) {
                System.out.printf("%-3d", rows / 2 + 1 - Math.abs(i) - Math.abs(j));
            }
            System.out.println(); // ����
        }
    }
}
