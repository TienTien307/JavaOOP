package tien.com.class_object;

public class LearnClassandObject {
    String name = "Tien";
    int age = 20;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void Cong2So(int a, int b) {
        System.out.println("Cong 2 so " + a + b);
    }

    public static void main(String[] args) {
        LearnClassandObject x = new LearnClassandObject();
        x.getName();
        x.Cong2So(1, 5);

        LearnClassandObject y = new LearnClassandObject();
        y.getAge();
        y.Cong2So(1, 9);

        //gọi thành phần của class thông qua tên class
        //bắt buộc những thành phần trong class  phải c trạng thái static
        //vd gọi từ class SinhVien

        System.out.println(SinhVien.getName());

        //gọi thành phần của 1 lớp theo kiểu Annonymus
        new LearnClassandObject().getAge();
    }
}
