package kethua;

public class Student extends Person{
//    public String name;
//    public int age;
//    public float height;
//    public Student(String name, int age, float height){
//        this.name = name;
//        this.age = age;
//        this.height = height;
//    }
//    public void getInfo(){
//        System.out.println("Name:" + this.name);
//        System.out.println("Age:" + this.age);
//        System.out.println("Height" + this.height);
//    }
    public String gender;
    public Student(String name, int age, float height, String gender){
        super(name, age, height);// nó truyền ngược vè class cha
        this.gender = gender;
    }
    public void getInfo(){
        super.getInfo();
        System.out.println("Gender:" + this.gender);
    }

    public static void main(String[] args) {
        Student student = new Student("John", 20, 1.75f, "nu");
        student.getInfo();
    }
}
