public class BlockDemo {
    public static void main(String[] args) {
        {   // ����1 (������) 
        }
        int a = 1;
        {   // ����2
            System.out.println(a);          // ����������ı���a����ӡ1��
            int i = 2;   // ����������������
            int a = 3;   // �Ƿ� (��������ı���a����) 
            {   // ����3 (Ƕ��������2�ڲ�) 
                System.out.println(a);      // ��ӡ1
            }
        }
        System.out.println(i);    // �Ƿ� (�˴����ܷ�������2�еı���i) 
        {   // ����4 (������1��2����) 
            int i = 4;   // ������2�еı���i����
            System.out.println(i);      // ��ӡ4
        }
    }
}
