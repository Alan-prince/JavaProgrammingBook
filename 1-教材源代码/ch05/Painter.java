class Square { // ������
}

class Triangle { // ��������
}

public class Painter { // �������࣬����draw������5�����ذ汾
    void draw(String str) { // �汾1
        System.out.println("�����ַ�����");
    }

    void draw(Square s) { // �汾2
        System.out.println("���ƾ��Ρ�");
    }

    void draw(Square s, int x, int y) { // �汾3
        System.out.println("��ָ��������ƾ��Ρ�");
    }

    void draw(int x, int y, Square s) { // �汾4
        System.out.println("��ָ��������ƾ��Ρ�");
    }

    void draw(Triangle t) { // �汾5
        System.out.println("���������Ρ�");
    }
}
