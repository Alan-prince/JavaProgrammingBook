package ch05;

import java.lang.Integer; // ϵͳ���Զ�����java.lang���µ��࣬�ʴ��п���ʡ��
import java.util.Date;
import javax.swing.*; // ����javax.swing���µ������࣬���Ƽ�
import javax.swing.border.*; // ���в�������swing���Ӱ� (��border) �µ��࣬��Ҫ��������
import java.awt.Color;
import ch05.demo.PackageDemo; // �����Լ��������

public class ImportDemo {
    Integer i = new Integer(5);
    Object o = new Object(); // Object��λ��java.lang���£���������
    Date d1 = new Date(); // java.util���µ�Date��

    // java.sql���µ�Date�࣬��java.util���µ�Date����������ʹ����ȫ�޶���
    java.sql.Date d2 = new java.sql.Date(0);

    // javax.swing���µ�JButton��
    JButton b = new JButton("ȷ����ť");

    // javax.swing.border���µ�LineBorder��
    LineBorder border = new LineBorder(Color.BLUE);

    // ch05.demo���µ�PackageDemo��
    PackageDemo demo = new PackageDemo();
}
