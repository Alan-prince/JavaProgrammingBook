public class CommandArgsDemo {
    public static void main(String[] args) {
        if (args.length < 2) {    // ����2������
            System.out.println("����������ʽ������Ҫָ��2��int�Ͳ�����");
            System.exit(0);   // ��������������� (���˳�Java����) 
        }
        int value;   // ��Ų���
        // ���׸�������Ϊ��ǰ����� (ע����������ַ�����Ҫ�Ƚ���Ϊ�����int��) 
        int max = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {  // �ӵ�2��������ʼ�Ƚ�
            value = Integer.parseInt(args[i]);
            max = (max < value ? value : max); // �޸�max (�ҵ����µ������) 
        }
        System.out.println("max = " + max);
    }
}
