package ch05;

class Father { // ���� (Ĭ�ϼ̳�Object��)
    protected int m = 2; // �����ֶ�
    private int n = 4; // ˽���ֶ�

    public Father() { // �޲ι��췽��
    }

    public Father(String s) { // �вι��췽��
    }

    public void methodA() { // ���з���
    }

    void methodB() { // Ĭ��Ȩ�޷���
    }

    private void methodC() { // ˽�з���
    }

    public void testFather(Father f) { // �β�Ϊ�������
    }
}

public class Son extends Father { // ����Son�̳и���Father
    public void testSon(Son s) { // �β�Ϊ�������
    }

    public static void main(String[] args) {
        Son s1 = new Son();// ����������� (���޲ι��췽����ϵͳ�ṩ���������Ը���)

        System.out.println(s1.m); // �Ϸ� (��Father��Son����ͬһ����Ҳ�Ϸ�)
        System.out.println(s1.n); // �Ƿ�
        s1.toString(); // �Ϸ� (toString������Object��ķ���)
        s1.methodA(); // �Ϸ�
        s1.methodB(); // �Ϸ� (��Father��Son����ͬһ������Ƿ�)
        s1.methodC(); // �Ƿ�
        s1.testFather(s1); // �Ϸ� (���������Ը�����������)

        Father f = new Father(); // �����������

        s1.testSon(f); // �Ƿ� (��������ܸ�����������)
        Son s2 = new Son("test"); // �Ƿ� (���಻���Զ�ӵ�и���Ĺ��췽��)
    }
}
