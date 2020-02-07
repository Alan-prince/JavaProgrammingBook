public class JosephRing {
    public static void main(String[] args) {
        final int N = 13;   // ������
        final int S = 3;    // �ӵ�S���˿�ʼ����
        final int M = 5;    // ����ΪM���˳�Ȧ
        boolean[] out = new boolean[N + 1]; // ͳһ�±����˵ı�� (��Ȼ����) 
        for (int i = 1; i <= N; i++) {       // ��ʼ������Ԫ��
            out[i] = false;    // ����ǰ�����˾�δ��Ȧ
        }
        int i = S;       // i����´ο�ʼ�������˵ı��
        int n = 0;       // �ѳ�Ȧ����
        int count;       // ����Ϊcount����
        System.out.print("��Ȧ˳��");
        while (n < N) {       // ��������Ȧ��
            count = 0;         // ��Ȧ�����¼���
            while (count < M) {       // δ������M
                if (out[i] == false) {   // ��������δ��Ȧ
                    count++;       // ����
                }
                if (count < M) {   // δ������M (�����if�������޸���count) 
                    // ����һ���˵ı�� (����N+1��ص���1����) 
                    i = (i + 1 > N ? 1 : i + 1);
                }
            } // �ڲ�while����
            System.out.print(i + "  ");  // �ڲ�while���������Ϊi���˳�Ȧ
            out[i] = true;    // ��ǳ�Ȧ����
            n++;                // ����1�˳�Ȧ
        } // ���while����
    }
}
