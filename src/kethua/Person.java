package kethua;

public class Person {
    public String name;
    public int age;
    public float height;
    public String address;
    //hàm xây dựng - constructor
    //nhận giá trị từ từ khóa super ở lớp con
    public Person(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, float height, String address){
        this.name = name;
        this.age = age;
        this.height = height;
        this.address = address;
    }
    public void getInfo(){
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
        System.out.println("height:" + this.height);
        System.out.println("address:" + this.address);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Nguyễn Văn", 20, 1.75f);
        p1.getInfo();
    }
}
