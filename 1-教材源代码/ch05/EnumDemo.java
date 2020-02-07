package ch05;

enum ShapeType { // ö������
    UNKNOWN, SQUARE, TRIANGLE, CIRCLE // ����ö�ٳ���
}

public class EnumDemo { // ������
    public static void main(String[] args) {
        ShapeType[] types = ShapeType.values(); // �õ����е�ö�ٳ���
        for (ShapeType t : types) {
            System.out.println(t.ordinal() + ": " + t.name());
        }

        ShapeType type = ShapeType.TRIANGLE; // �����ͳ�ʼ��ö�ٶ���
        System.out.println(type.getDeclaringClass().getName());

        switch (type) {
            case UNKNOWN:
                System.out.println("δ֪��״");
                break;
            case SQUARE:
                System.out.println("������");
                break;
            case TRIANGLE:
                System.out.println("������");
                break;
            case CIRCLE:
                System.out.println("Բ��");
                break;
        }
    }
}
