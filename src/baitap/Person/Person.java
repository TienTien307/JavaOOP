package baitap.Person;

public class Person {
    public String name;
    public int age;
    public String gender;
    public String address;
    public String phone;

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    public  Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void getInfo(){
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("gender: " + this.gender);
        System.out.println("address: " + this.address);
        System.out.println("phone: " + this.phone);
    }
}

