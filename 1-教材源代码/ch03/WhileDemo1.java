public class WhileDemo1 {
    public static void main(String[] args) {
        int factorial = 1;    // ����۳˻��ı�����ʼ��Ϊ1
        int n = 6, i = 2;     // i��Ϊѭ������ (Ҳ��ѭ��������) 
        while (i <= n) {      // ����2*...*n
            factorial *= i;   // �۳�
            i++;                 // �޸�i���Ա���һ���۳ˡ�
        }
        System.out.println(n + " �Ľ׳� = " + factorial);
    }
}
