package ch05.override;

public class Circle extends Shape { // �̳���״��
    public void draw() { // ��д���෽��
        type = ShapeType.CIRCLE;
        System.out.println("����" + type + "����1��Բ��");
    }
}
