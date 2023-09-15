package baitap.company;

import baitap.Person.Person;

public class Company extends Person {

    public Company(String name, int age, String gender) {
        super(name, age, gender);
    }
    public void getInfo(){
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("gender: " + this.gender);
    }

    public static void main(String[] args) {
        Company company = new Company("ABC", 25, "Nam");
//        Person company = new Person("ABC", 25, "Nam");
        company.getInfo();
    }
}
