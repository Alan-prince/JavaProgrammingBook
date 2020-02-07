package ch05;

class Parent { // Ĭ�ϼ̳�Object��
    // δ��д����Object���κη���
}

class Child extends Parent { // �̳�Parent��
    int seriesNo; // ���к��ֶ�

    public Child(int seriesNo) { // ���췽��
        this.seriesNo = seriesNo;
    }

    public int hashCode() { // ��дObject��ķ���
        return seriesNo; // �����к��ֶ���Ϊ����Ĺ�ϣ��
    }

    public String toString() { // ��дObject��ķ���
        return "�ҵ����к��ǣ�" + seriesNo; // �Զ���������������
    }
}

public class ObjectClassDemo { // ������
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child(10001);

        System.out.println("p�Ĺ�ϣ�� = " + p.hashCode());
        System.out.println("c�Ĺ�ϣ�� = " + c.hashCode() + "\n");
        System.out.println("p���������� = " + p.toString());
        System.out.println("c���������� = " + c.toString() + "\n");
        System.out.println("p�������� = " + p.getClass().getName());
        System.out.println("c�������� = " + c.getClass().getName());
    }
}
