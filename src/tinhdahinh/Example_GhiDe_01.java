package tinhdahinh;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }

}

public class Example_GhiDe_01 extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }

    void run1() {
        System.out.println("run1");
    }

    public static void main(String[] args) {
        Example_GhiDe_01 obj = new Example_GhiDe_01();
        obj.run1();

//        Vehicle vh = new Vehicle();
//        vh.run();
    }
}
