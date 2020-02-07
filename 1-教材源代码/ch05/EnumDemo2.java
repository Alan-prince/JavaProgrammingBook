package ch05;

enum WeekDay { // ö������
    MON("Monday", "����һ"), // ����ö�ٳ���ʱ���ù��췽��
    TUE("Tuesday", "���ڶ�"),
    WED("Wednesday", "������"),
    THU("Thursday", "������"),
    FRI("Friday", "������"),
    SAT("Saturday", "������"),
    SUN("Sunday", "������"); // �����ķֺŲ���ʡ��

    private String enName, cnName; // �ֶ� (���ö�ٳ�����Ӣ����������)

    // ���췽�� (��������ö�������ⲿͨ�����췽������ö�ٶ��󣬹���˽�е�)
    private WeekDay(String enName, String cnName) {
        this.enName = enName;
        this.cnName = cnName;
    }

    public String getEnName() { // getter
        return enName;
    }

    public String getCnName() {
        return cnName;
    }
}

public class EnumDemo2 { // ������
    public static void main(String[] args) {
        System.out.printf("%-6s %-10s %-12s %s\n", "����", "ö�ٳ���", "Ӣ������", "��������");
        System.out.print("-------------------------------------------------\n");
        for (WeekDay d : WeekDay.values()) {
            System.out.printf("%-8d %-14s %-16s %s\n", d.ordinal(), d.name(), d.getEnName(), d.getCnName());
        }
    }
}
