package ch05;

import ch05.override.Shape;

class Product { // ��Ʒ��
    int id; // ���
    String name; // ����

    public Product(int id, String name) { // ���췽��
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) { // ��дequals����
        if (obj instanceof Product) { // �ж�obj�Ƿ�Ϊ��Ʒ����
            return id == ((Product) obj).id; // �Ƚ�id
        }
        return false;
    }

    public int hashCode() { // ��дhashCode����
        return id % 1000; // ��idΪ�����׼ (ȷ��id��ͬ���ϣ��һ����ͬ)
    }
}

public class ObjectEqualsDemo {
    public static void main(String[] args) {
        Shape s1 = new Shape(); // ����ǰ��Shape��Ķ���
        Shape s2 = new Shape();
        System.out.printf("1: %-30s", s1 == s2 ? "s1 == s2" : "s1 != s2");
        System.out.println(s1.equals(s2) ? "s1 equals s2" : "s1 not-equals s2");
        System.out.printf("2: %-30s", "HashCode(s1)=" + s1.hashCode());
        System.out.println("HashCode(s2)=" + s2.hashCode());

        Integer a = new Integer(1); // Integer������д��equals���� (�Ƚ�ֵ)
        Integer b = new Integer(1);
        System.out.printf("3: %-30s", a == b ? "a == b" : "a != b");
        System.out.println(a.equals(b) ? "a equals b" : "a not-equals b");
        // Integer������д��hashCode���� (��ֵ��Ϊ��ϣ��)
        System.out.printf("4: %-30s", "HashCode(a)=" + a.hashCode());
        System.out.println("HashCode(b)=" + b.hashCode());

        Product p1 = new Product(100101, "iPhone XS");
        Product p2 = new Product(100101, "ƻ��XS");
        System.out.printf("5: %-30s", p1 == p2 ? "p1 == p2" : "p1 != p2");
        System.out.println(p1.equals(p2) ? "p1 equals p2" : "p1 not-equals p2");
        System.out.printf("6: %-30s", "HashCode(p1)=" + p1.hashCode());
        System.out.println("HashCode(p2)=" + p2.hashCode());
    }
}
