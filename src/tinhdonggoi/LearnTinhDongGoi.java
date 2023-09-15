package tinhdonggoi;

public class LearnTinhDongGoi {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getSchoolName());

        //set thông tin
        student.setMsv("S01");
        student.setName("Nguyễn Văn");
        student.setAge(20);
        student.setPassword("SeleniumJava123456");

        //lấy ra thông tin
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getMsv());
        System.out.println(student.getPhone());
        System.out.println(student.getPassword());

    }


}
