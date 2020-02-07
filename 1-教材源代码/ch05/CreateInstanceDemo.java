package ch05;

class Food { // ʳ��
}

class Fruit extends Food { // ˮ���̳�ʳ��
    Fruit() { // ϵͳ���ȵ���Food()
        System.out.println("Fruit()");
    }

    Fruit(String color) { // ϵͳ���ȵ���Food()
        System.out.println("Fruit(String)");
    }
}

class Apple extends Fruit { // ƻ���̳�ˮ��
    Apple() { // ϵͳ���ȵ���Fruit()
        System.out.println("Apple()");
    }

    Apple(String color) {
        this(color, 0); // ��ʽ����Apple(String, int)
        System.out.println("Apple(String)");
    }

    Apple(String color, int count) {
        super(color); // ��ʽ����Fruit(String)
        System.out.println("Apple(String, int)");
    }
}

public class CreateInstanceDemo { // ������
    public static void main(String[] args) {
        Apple a1 = new Apple();
        System.out.println();

        Apple a2 = new Apple("red");
        System.out.println();

        Apple a3 = new Apple("green", 20);
    }
}
