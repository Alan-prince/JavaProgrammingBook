public class DoWhileDemo {
    public static void main(String[] args) {
        long n = 987654321;        // Ҫ�������������
        do {
            System.out.print(n % 10);   // ��ӡ��λ��
            n /= 10;                        // ���� (ȥ����λ��) 
        } while (n != 0);                 // n������0ʱ������ѭ����
    }
}
