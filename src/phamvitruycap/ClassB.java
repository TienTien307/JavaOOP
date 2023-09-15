package phamvitruycap;

public class ClassB {
    protected int data = 40;

    protected void msg(){
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        ClassA A = new ClassA();
//        A.x = "A";
        System.out.println(A.x);
    }

}
