public class WhileDemo2 {
    public static void main(String[] args) {
        double pi = 0;           // ����ۼӺ͵ı�����ʼ��Ϊ0
        double item = 1;        // ��ǰ�� (�����ţ���1��Ϊ1) 
        int deno = 1;            // ��ǰ��ķ�ĸ (��1���ĸΪ1) 
        int sign = 1;            // ��ǰ��ķ��� (��1�����Ϊ��) 
        // ������Math���abs������ǰ��ľ���ֵ
        while (Math.abs(item) > 1e-6) {   // ��ָ����ʽ�ĸ��������бȽ�
            pi += item;       // �ۼ�
            sign = -sign;     // ������һ��ķ��� (��������) 
            deno += 2;        // ������һ��ķ�ĸ
            item = sign * 1.0 / deno;    // ������һ�� (ע��sign/denoΪ����) 
        }
        pi *= 4;        // ��ʽ������Ǧ�/4
        System.out.print("PI = " + pi + "   ����Ҫ������һ�� = ");
        // while��������item������Ҫ������һ�����һ���Ҫ���¼�����ǰһ��
        System.out.print((-sign) * 1 + "/" + (deno - 2));
    }
}
