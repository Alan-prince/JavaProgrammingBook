public class VarArgsDemo {
    // �䳤�����ĸ�ʽΪ������... �β�����
    int getMax(int first, int... varArgs) {
        int max = first; // ����1����Ϊ��ǰ�����
        for (int i : varArgs) { // ���� (�䳤�����ı���������)
            max = i > max ? i : max; // �޸�max
        }
        return max; // ����max
    }

    public static void main(String[] args) {
        VarArgsDemo demo = new VarArgsDemo(); // ����������Ķ���
        // ���÷������ֱ���1��2��6��ʵ��
        System.out.println("max(1) = " + demo.getMax(1));
        System.out.println("max(2,1) = " + demo.getMax(2, 1));
        System.out.println("max(6,4,5,9,8,7) = " + demo.getMax(6, 4, 5, 9, 8, 7));
    }
}
