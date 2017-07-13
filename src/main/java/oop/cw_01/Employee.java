package oop.cw_01;

class Employee {

//    fields
    String name;
    int age;
    int salary;
    Address address;

//    methods
    void greeting() {
        System.out.println("Hello! My name is " + name);
        System.out.println("I'm " + age + " years old.");
    }
}
