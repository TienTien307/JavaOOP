package tien.com.class_object;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.getAddress();

        nv.setName("test");
        System.out.println(nv.getName());
    }
}
