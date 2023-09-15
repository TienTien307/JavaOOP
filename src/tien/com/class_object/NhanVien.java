package tien.com.class_object;

import java.util.concurrent.SubmissionPublisher;

public class NhanVien {
    public int age;
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String address;
    public String jobName;
    public int getAge() {
        return age;
    }

    public String getName() {
        return name + " - " + SinhVien.getName();
    }

    public String getAddress() {
        return address;
    }

    public String getJobName() {
        return jobName ;
    }

    public static void main(String[] args) {

    }

}
