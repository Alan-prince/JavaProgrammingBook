public class IfElseDemo {
    public static void main(String[] args) {
        int a = 1, b = 2;
        if (a > b)                         // false
            System.out.print("a>b\t"); // 1�������Բ��ӻ�����
        else
            System.out.print("a<=b\t");// ִ�� (������else����) 

        if (a < b) {                       // true
            System.out.print("+++\t"); // if��else֮��Ķ���������ӻ�����
            System.out.print("---\t");
        } else;                             // ���˷ֺŲ��������﷨����
            System.out.print("***\t");  // ִ�� (���в���else����) 

        if (a > b)                         // false
            System.out.print("@@@\t");
        else {
            System.out.print("%%%\t");  // else���ƶ������Ҳ����ӻ�����
            System.out.print("!!!\t");
        }
    }
}
