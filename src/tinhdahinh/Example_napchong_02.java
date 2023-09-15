package tinhdahinh;

public class Example_napchong_02 {
    public int add (int a, int b){
        return a + b;
    }

    public double add (double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Example_napchong_02 nc2 = new Example_napchong_02();
        System.out.println((int)nc2.add(2,9));
    }
}
