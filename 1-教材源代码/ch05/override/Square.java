package ch05.override;

public class Square extends Shape { // �̳���״��
    public void draw() { // ��д���෽��
        type = ShapeType.SQUARE; // �޸ļ̳��Ը�����ֶ� (������д�����ֶ�)
        System.out.println("����" + type + "����4���ߡ�");
    }
}
