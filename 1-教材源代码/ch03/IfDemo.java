public class IfDemo {
    public static void main(String[] args) {
        int a = 1, b = 2;
        if (a < b)                         // true
            System.out.print("a<b\t"); // ִ��
        if (a > b)                         // false
            System.out.print("a>b\t"); // ��ִ��
        if (a<b) {                         // true 
            System.out.print("+++\t"); // ִ��
            System.out.print("---\t"); // ִ�� (��������) 
        }
        if (a>b)                            // false
            System.out.print("***\t");  // ��ִ��
            // ִ�� (�����Գ�������û��Ӱ�죬���в��ܵ�4��if����) 
            System.out.print("///\t");
        if (a>b);                           // false����if���Ƶ��ǿ���䡣
            System.out.print("%%%");     //ִ��
    }
}
