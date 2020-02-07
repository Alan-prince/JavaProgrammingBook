public class ConstructorDemo { // ���Բ���Person���й��췽���Ĳ�����
    boolean isFirstPrint = true; // �Ƿ��״ε���print����

    public static void main(String[] args) { // �������
        // Person p = new Person(); // �Ƿ���ϵͳ����ΪPerson���ṩĬ�Ϲ��췽��

        // ���ò�ͬ���췽������Person��Ķ��󣬲�����Person���͵ı���
        Person p1 = new Person("Tom");
        Person p2 = new Person("Andy", "100200200109081234");
        Person p3 = new Person("Chris", 24, "30040019990401000X");

        // ������������Ķ���demo���Ե�����print������
        // ��������û�б�д�κι��췽������ϵͳ�Զ��ṩĬ�Ϲ��췽����
        ConstructorDemo demo = new ConstructorDemo();

        demo.print("P1", p1);// �ԡ�������.������(ʵ�α�)������ʽ���ö���ķ���

        p1.setAge(30); // �޸�p1���������
        demo.print("P1", p1);

        p2.name = "Jack"; // �ԡ�������.�ֶ���������ʽ���ʶ�����ֶ�
        p2.id = "200200198011084321"; // �޸�p2��������֤
        p2.setAge(25);
        demo.print("P2", p2);

        demo.print("P3", p3);

        // ֱ�ӽ������Ķ�����Ϊprint�����ĵ�2��ʵ�Σ�
        // �ö���û�и���Person���͵ı�����ֻ��ʹ��һ�Σ���Ϊ���������󡱡�
        demo.print("Anonymous", new Person("Joe"));

        System.out.println();
        p1.sleep(15);
        p1.sleep(30);
        p1.sleep(10);
    }

    // ��ӡ�β�pָ����Person�������Ϣ (�β�tag������Ƕ����Ա�۲���)
    void print(String tag, Person p) {
        if (isFirstPrint) { // ���״δ�ӡ�����ӡ��ͷ
            System.out.printf("%-10s %-10s %-5s %s\n", "tag", "name", "age", "id");
            System.out.print("----------------------------------------------\n");
            isFirstPrint = false;
        }
        System.out.printf("%-10s %-10s %-5d %s\n", tag, p.name, p.age, p.id);
    }
}
