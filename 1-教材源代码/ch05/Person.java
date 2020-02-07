public class Person {
    String name;
    int age; // ���췽��1��2ָ����Ĭ��ֵ���˴�����ָ��
    String id;

    String getName() {
        return name; // �ȼ��ڣ�return this.name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) { // �β����ֶ�����
        this.age = age;
    }

    Person sleep(int minutes) {
        System.out.println("˯ " + minutes + " ����...");
        return this;
    }

    Person(String name) { // ���췽��1
        this(name, 20, "N/A"); // ���ù��췽��3
    }

    Person(String name, String id) { // ���췽��2
        this(name, 20, id); // ���ù��췽��3
    }

    Person(String name, int age, String id) { // ���췽��3 (��ȫ���췽��)
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
