public class NestedIfElseDemo {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        if (a < b)                         // true
            if (c > d)                     // false
                System.out.print("A");
            else
                System.out.print("B");  // ��ӡB

        if (a < b) {                      // true
            if (c < d)                     // true
                System.out.print("C");  // ��ӡC
        } else
            System.out.print("D");

        // �����ж϶��������һ��ĳ������Ϊtrue��ִ������Ӧ���������
        // �˳������ṹ������������������������ִ������else���Ƶ��������顣
        // Ϊ���������⣬�����˹淶������ (������ʵ�ʳ�����Ϊ��31~38�ĸ�ʽ)��
        if (a > b)                             // false
            System.out.print("E");
        else 
            if (a > c)                         // false
                System.out.print("F");
            else 
                if (c < d)                     // true
                    System.out.print("G");  // ��ӡG
                else
                    System.out.print("H");
        
        // ����Ľṹ����һ�ṹ��ȫ�ȼ�
        if (a > b)                           // false
            System.out.print("E");
        else if (a > c)                     // false
            System.out.print("F");
        else if (c < d)                     // true
            System.out.print("G");        // ��ӡG
        else
            System.out.print("H");
    }
}
