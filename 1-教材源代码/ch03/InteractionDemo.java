import java.util.Scanner;

public class InteractionDemo {
    public static void main(String[] args) {
        int option;   // �������ѡ��
        int i;
        float f;
        String s;
        System.out.println("---------- ѡ��˵� --------");
        System.out.println("1����������      2������С��   \n3�������ַ���    0���˳�    ");
        System.out.println("----------------------------");
        Scanner scanner = new Scanner(System.in);
        loop: while (true) {   // ѭ��������ԶΪtrue (��break������) 
            System.out.print("ѡ�");
            option = scanner.nextInt();   // �ȴ�����ѡ��
            switch (option) {   // �ж������ѡ��
                case 0:           // �˳�
                    System.out.print("\tȷ��Ҫ�˳��� (Y/N) ��");
                    s = scanner.next();    // �ȴ������ַ���
                    // �ж��ַ����Ƿ���Ȳ�Ҫ�á�==������� (����15��) 
                    if (s.equalsIgnoreCase("Y")) {
                        System.out.println("\t�����˳���");
                        break loop;    // ����whileѭ��
                    } else {
                        break;          // ����switch
                    }
                case 1:                 // ����
                    System.out.print("\t������������");
                    i = scanner.nextInt();     // �ȴ���������
                    System.out.println("\t���������" + i + "��");
                    break;
                case 2:
                    System.out.print("\t������С����");
                    f = scanner.nextFloat();   // �ȴ�����С��
                    System.out.println("\t���������" + f + "��");
                    break;
                case 3:
                    System.out.print("\t�������ַ�����");
                    s = scanner.next();
                    System.out.println("\t���������\"" + s + "\"��");
                    break;
                default:                // ����ѡ��
                    System.out.println("\t��������ȷ��ѡ�");
            }  // switch����
        }  // while����
    }
}
