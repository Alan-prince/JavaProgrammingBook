package ch05;

import java.util.Date; // ����������

public class GCDemo {
    public static void main(String[] args) {
        // �ж��׸������в����Ƿ�ΪGC
        boolean gc = args.length > 0 && args[0].equalsIgnoreCase("GC");

        Runtime rt = Runtime.getRuntime(); // �������ʱ����
        System.out.println("ѭ��ǰ�����ڴ棺" + rt.freeMemory() / 1024 + " KB");

        final int TOTAL = 100000; // ѭ���ܴ���
        Date[] ds = new Date[TOTAL]; // ��ʼ������

        for (int i = 0; i < TOTAL; i++) {
            ds[i] = new Date(); // ��ʼ������Ԫ��
            process(ds[i]); // �������ڶ���

            // ds[i] = null; // ��ʹ����Ķ�����ʽ��Ϊnull

            if (gc && (i % 9999 == 0)) { // ÿѭ��10000������һ����������
                System.gc();
            }

            if (i == 80000 - 1) { // ��80000��ѭ��
                System.out.println("��80000��ѭ��ʱ�����ڴ棺" + rt.freeMemory() / 1024 + " KB");
                break;
            }
        }
    }

    private static void process(Date d) {
        // ... // �������ڶ���d
    }
}
