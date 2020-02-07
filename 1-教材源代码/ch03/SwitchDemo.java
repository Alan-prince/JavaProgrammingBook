public class SwitchDemo {
    public static void main(String[] args) {
        char answer = 'A';     // char��
        float score = 48;      // float��
        String today = "Fri"; // �ַ�����

        switch (answer) { // char���Զ�����Ϊint��
            case 'B': // ֱ�ӳ��� (case�Ӿ���ƵĶ��������Բ��ӻ�����)
                System.out.print("B");
                break; // �����������ڵ�switch��䣬��ͬ��
            case 64 + 1: // ��� (�������ʽ)
                System.out.print("A");
                break;
            case 'D': { // �����ſ���ʡ��
                System.out.print("D");
                break;
            }
            case 'C':
                System.out.print("C");
                break;
            default: // ������� (λ��switch�����Ӿ䣬����ʡ��break���)
                System.out.print("����𰸣�");
        }
        System.out.print("\t");

        switch (answer) {
            case 'B':
                System.out.print("B");
            case 'A': // ��� (�˺��ٱȽϣ�����ִ�к����case�Ӿ�)
                System.out.print("A");
            case 'D':
                System.out.print("D");
            case 'C':
                System.out.print("C");
                break; // ������Ž���switch���
            default:
                System.out.print("����𰸣�");
        }
        System.out.print("\t");

        if (score >= 0 && score <= 100) { // �жϷ�����Χ
            switch (((int) score) / 10) { // ǿ��ȡ����������
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: // 0~59
                    System.out.print("������");
                    break;
                case 6: // 60~69
                    System.out.print("����");
                    break;
                case 7: // 70~79
                    System.out.print("�е�");
                    break;
                case 8: // 80~89
                    System.out.print("����");
                    break;
                case 9:
                case 10: // 90~100
                    System.out.print("����");
            }
        } else { // ������Χ
            System.out.print("����С��0�����100��");
        }
        System.out.print("\t");

        switch (today) { // JDK 7��ʼ֧���ַ������ʽ
            case "Mon":
                System.out.print("��һ");
                break; // һ����������switch (����ȷ�õ�today���ܼ�)����ͬ
            case "Tue":
                System.out.print("�ܶ�");
                break;
            case "Wed":
                System.out.print("����");
                break;
            case "Thu":
                System.out.print("����");
                break;
            case "Fri":
                System.out.print("����");
                break;
            case "Sat":
                System.out.print("����");
                break;
            case "Sun":
                System.out.print("����");
                break;
            default:
                System.out.print("δ֪��");
        }
    }
}
