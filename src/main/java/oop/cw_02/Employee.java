package oop.cw_02;

/**
 * - public             - виден всем
 * - protected          - видео в классе, пакете, наследниках
 * - [package-private]  - виден в классе, пакете
 * - private            - виден в классе
 *
 * class        [public, package-private]
 * field        [any]
 * constructor  [any]
 * method       [any]
 */
public class Employee {

//    fields
    private String name;
    private int age;
    private int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    Employee(String name) {
        this.name = name;
    }

    Employee() {
    }

//    getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Sorry, i cant do that. Age cannot be negative.");
        } else {
            this.age = age;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //    methods
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
        System.out.println("I'm " + this.age + " years old.");
    }

    public int calcIncreasedValueSalaryByPeriod(int value, int mounths) {
        int newSalary = this.salary + value;

        return calcSalaryByPeriod(newSalary, mounths);
    }

    public int calcIncreasedPercentSalaryByPeriod(int percent, int mounths) {
        int newSalary = this.salary + this.salary * (percent / 100);

        return calcSalaryByPeriod(newSalary, mounths);
    }

    private int calcSalaryByPeriod(int salary, int period) {
        int total = 0;
        for (int i = 0; i < period; i++) {
            total += salary;
        }
        return total;
    }
}
