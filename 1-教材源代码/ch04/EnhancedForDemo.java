public class EnhancedForDemo {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) { // ��ѭ����ֵ (Ԫ�ؾ���һ������) 
            a[i] = 10 - 2 * i;
        }
        int i = 0;   // �±�
        for (int e : a) {    // ��ǿ��forѭ��
            System.out.print("a[" + (i++) + "]=" + e + "  ");
        }
    }
}
