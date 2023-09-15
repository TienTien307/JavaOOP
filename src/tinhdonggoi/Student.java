package tinhdonggoi;

public class Student {
    //biến thể hiện giá trị thông tin sv

    private String msv;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String password;



    private String phone;
    private String address;

    public String getSchoolName() {
        return schoolName;
    }

    private final String schoolName = "CNTT";  // final - ko thay đổi

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() < 6){
            System.out.println("Password must be at least 6 characters");
        } else if (password.length() > 16) {
            System.out.println("Password must be <at least> 16 characters");
        } else {
            this.password = password;
        }
    }
    //get value
    public String getMsv() {
        return msv;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
    // set value
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
