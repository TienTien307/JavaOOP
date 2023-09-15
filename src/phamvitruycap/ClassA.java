package phamvitruycap;

public class ClassA {
    private int data = 40;

    private void msg() {
        System.out.println("Hello Java");
    }
    protected String x = "Protected";

    public static void main(String[] args) {
        ClassA A = new ClassA();
        A.msg();
        System.out.println(A.x);
    }
}

