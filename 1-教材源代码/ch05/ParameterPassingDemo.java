package ch05;

class Student { // ����Ĳ����ཫʹ�ô���
    private int age;

    public int getAge() { // age��getter
        return age;
    }

    public void setAge(int age) { // age��setter
        this.age = age;
    }

    public Student(int age) { // ���췽��
        this.age = age;
    }
}

public class ParameterPassingDemo { // ������(Ҳ������)
    public static void main(String[] args) {
        ParameterPassingDemo demo = new ParameterPassingDemo(); // ����������Ķ���
        int a = 2; // ����m1ʱ��Ϊʵ��
        Student s1 = new Student(18); // ����m2ʱ��Ϊʵ��

        /**** ����m1 ****/
        System.out.print("m1-->\t����ǰ��a=" + a + "\t");
        demo.m1(a);
        System.out.println("\t���ú�a=" + a); // aδ��

        /**** ����m2 ****/
        System.out.print("m2-->\t����ǰ��s1=" + s1.hashCode() + "\t");
        System.out.println("age=" + s1.getAge());
        demo.m2(s1);
        System.out.print("\t���ú�s1=" + s1.hashCode() + "\t"); // s1δ��(��ָ��ԭ������)
        System.out.println("age=" + s1.getAge()); // age����(������ֶα��޸���)
    }

    private void m1(int a) { // �������͵Ĳ�������ֵ
        a++; // �޸��ββ���Ӱ�촫���ʵ��
    }

    private void m2(Student s2) { // �������͵Ĳ�����������
        System.out.print("\t�����У�s2=" + s2.hashCode() + "\t"); // s2��s1ָ��ͬһ����
        s2.setAge(s2.getAge() + 10); // �޸��β�s2ָ��Ķ�����ֶ�
        s2 = new Student(18); // ʹ�β�s2ָ����һ����(ʵ��s1��ָ��ԭ����)
        System.out.println("s2=" + s2.hashCode()); // s2����
    }
}