public class AddDemo {
    public static void main(String[] args) {
        int a = 1, b = 3;
        char c = '��';   // '��'�ַ���Unicode����Ϊ25105
        System.out.print(a + b + c + "\t");      // ��ӡ�󲻻���
        System.out.print(a + b + "��" + "\t");
        System.out.print("I am " + true + "\t");
        System.out.print("��" + a + b + "\t");
        System.out.print("��" + (a + b) + "\t");
        System.out.print("��" + (a + "" + b));
    }
}
