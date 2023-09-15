package tinhdahinh;

public class Example_napchong_01 {
    public void tinhTong(int a, int b) {
        System.out.println(a + b);
    }
    public void tinhTong(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Example_napchong_01 nc = new Example_napchong_01();
        nc.tinhTong(1, 2);
    }
}
