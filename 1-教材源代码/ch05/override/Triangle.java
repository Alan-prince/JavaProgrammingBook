package ch05.override;

public class Triangle extends Shape { // �̳���״��
    public void draw() { // ��д���෽��
        type = ShapeType.TRIANGLE;
        System.out.println("����" + type + "����3���ߡ�");
    }
}
