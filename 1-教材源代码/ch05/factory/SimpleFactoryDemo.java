package ch05.factory;

class Auto { // �����Ʒ��
    public void start() { // �涨��������Ӧ���е���Ϊ
        // �˴���д�κδ��붼û��ʵ������ (�������д�˷���)
    }
}

class Benz extends Auto { // �����Ʒ����
    public void start() { // ��д���෽��
        System.out.println("��������");
    }
}

class Bmw extends Auto {
    public void start() {
        System.out.println("��������");
    }
}

enum AutoType { // �����Ʒ����
    BENZ, BMW
}

class AutoFactory { // ��Ʒ������
    public static Auto create(AutoType type) { // ��̬����
        switch (type) {
            case BENZ:
                return new Benz(); // �������һ���Ǹ������
            case BMW:
                return new Bmw();
            default:
                return null;
        }
    }
}

public class SimpleFactoryDemo { // ������
    public static void main(String[] args) {
        // ���ò�Ʒ�����ľ�̬�������������Ʒ����
        Auto a1 = AutoFactory.create(AutoType.BENZ);
        Auto a2 = AutoFactory.create(AutoType.BMW);
        a1.start(); // ʹ�þ����Ʒ����
        a2.start();
    }
}
