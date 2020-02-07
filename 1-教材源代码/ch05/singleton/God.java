package ch05.singleton;

public class God { // ������ (ֻ��һ���ϵ�)
    // ���Ψһ�����˽���ֶ� (����޷�����)����getInstance����
    // Ҫʹ�ô��ֶΣ����Ǿ�̬�ģ��ʴ��ֶ�Ҳ�����Ǿ�̬�ġ�
    private static God instance = null;

    private God() { // ˽�й��췽�� (����޷�����)
        System.out.println("God���󱻴����ˡ�"); // ������ʾ��
    }

    // ���о�̬���������ͨ��God����ֱ�ӵ��ô˷������Ի��Ψһ����
    public static God getInstance() {
        if (instance == null) { // �����״ε���getInstance����
            // �������󲢸���instance�ֶΡ�
            // ��ʹ��ε���getInstance����������Ҳִֻ��һ�Ρ�
            instance = new God();
        }
        return instance; // ����Ψһ����
    }
}
