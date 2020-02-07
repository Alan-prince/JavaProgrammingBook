import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class KMeans {
    int N = 300; // ���ݵ����
    int K = 3;// ������

    double[][] points = new double[N][2];// ���ݵ�(2�зֱ��ʾx��y����)
    double[][] centers = new double[K][2];// ��������
    double[][] distances = new double[N][K];// ���ݵ㵽�������ĵľ���
    int[] kinds = new int[N];// ���ݵ������ķ���

    JFrame win; // ���ڳ��ַ������Ĵ���
    final int WIN_HEIGHT = 420;// ���ڸ߶�
    final int WIN_WIDTH = 600;// ���ڿ��

    // �����Ǻ���ɫ
    final String[] MARKER_TEXTS = { "X", "O", "��" };
    final Color[] MARKER_COLORS = { Color.RED, Color.MAGENTA, Color.BLUE };

    // Χ�Ƹ�����K�����������N�����ݵ�
    void generatePoints() {
        // ����K���������
        double[][] ps = { { 300, 50 }, { 480, 300 }, { 120, 200 } }; 
        Random r = new Random();// ���������
        int p; 
        for (int i = 0; i < N; i++) {
            p = r.nextInt(K);// ���ѡ��һ�������ĵ�
            // Χ�Ƶ�p�������һ�����ݵ�
            points[i][0] = ps[p][0] + (r.nextBoolean() ? r.nextInt(100) : -r.nextInt(100));
            points[i][1] = ps[p][1] + (r.nextBoolean() ? r.nextInt(50) : -r.nextInt(50));
        }
    }

    // ѡ��K�����ݵ���ΪK������ĳ�ʼ����
    void initCenters() {
        for (int i = 0; i < K; i++) {
            centers[i][0] = points[i * N / K][0];
            centers[i][1] = points[i * N / K][1];
        }
    }

    // ��ÿ�����ݵ㣬��������������Ľ��з���
    void assignPoints() {
        double dx, dy;
        double min;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {// �����i��K�����ĵľ���
                dx = points[i][0] - centers[j][0];
                dy = points[i][1] - centers[j][1];
                distances[i][j] = dx * dx + dy * dy;
            }
            // ѡ�����������������Ϊ��i�����ķ���
            min = distances[i][0];
            kinds[i] = 0;
            for (int j = 1; j < K; j++) {
                if (distances[i][j] < min) {
                    min = distances[i][j];
                    kinds[i] = j;
                }
            }
        }
    }

    // �������е�ķ��࣬�����µ�����
    void calcCenters() {
        for (int j = 0; j < K; j++) {
            centers[j][0] = 0;
            centers[j][1] = 0;
            int count = 0;
            // ͳ�����ڷ���j�ĵ�ĸ���
            for (int i = 0; i < N; i++) {
                if (kinds[i] == j) {
                    centers[j][0] += points[i][0];
                    centers[j][1] += points[i][1];
                    count++;
                }
            }
            // �������j����������(x��y��������ֵ����K-Means�㷨���Ƶ�����)
            centers[j][0] /= count;
            centers[j][1] /= count;
        }
    }

    // ��ʼ��UI(�����ڳ��ֽ��)
    void initUI() {
        win = new JFrame("K-Means");
        win.setSize(WIN_WIDTH, WIN_HEIGHT);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false);
        win.setVisible(true);
    }

    // ����N�����ݵ㼰K������(�����ڳ��ֽ��)
    void plot() {
        Graphics g = win.getGraphics();
        g.clearRect(0, 0, WIN_WIDTH, WIN_HEIGHT);// ���֮ǰ���Ƶĵ�
        // �Բ�ͬ��Ǻ���ɫ���Ƹ������еĵ�
        for (int i = 0; i < N; i++) {
            g.setColor(MARKER_COLORS[kinds[i]]);
            g.drawString(MARKER_TEXTS[kinds[i]], (int) points[i][0], (int) (WIN_HEIGHT - 20 - points[i][1]));
        }
        // ���Ƹ����������
        for (int i = 0; i < K; i++) {
            g.setColor(Color.BLACK);
            g.drawString("��", (int) centers[i][0], (int) (WIN_HEIGHT - 20 - centers[i][1]));
        }
    }

    // �������
    public static void main(String[] args) throws InterruptedException {
        KMeans kMeans = new KMeans();
        kMeans.generatePoints();
        kMeans.initCenters();
        kMeans.initUI();

        for (int i = 0; i < 10; i++) { // ����10��
            kMeans.plot();
            kMeans.assignPoints();
            kMeans.calcCenters();
            Thread.sleep(500); // ��ͣ0.5��(���ڹ۲��������)
        }
    }
}
