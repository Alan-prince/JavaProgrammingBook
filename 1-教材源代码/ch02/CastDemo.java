public class CastDemo {
    public static void main(String[] args) {
        short s = 32767;       // �����ƣ�0111 1111 1111 1111
        int i = 65536 + 97;   // �����Ƶĵ�16λ��Ӧʮ������97
        byte b = 64;
        double d = 123.456787654321; // С��λ�϶�
        float f = 456.78f;

        System.out.println("1��short �� byte��" + s + " �� " + (byte) s);
        System.out.println("2��int �� char��" + i + " �� " + (char) i);
        System.out.println("3��byte �� long��" + b + " �� " + (long) b);
        System.out.println("4��int �� float��" + i + " �� " + (float) i);
        System.out.println("5��double �� float��" + d + " �� " + (float) d);
        System.out.println("6��float �� double��" + f + " �� " + (double) f);
        System.out.println("7��float �� int��" + f + " �� " + (int) f);
    }
}
