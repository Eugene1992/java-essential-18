package oop.cw_09;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        House house = new House(77);

        Employee employee = new Employee("Ivan", 22, 10000, house);

        Employee clone = new Employee(employee);

        System.out.println(clone.name);

        clone.house.number = 666;

        System.out.println(employee.house.number);

        Class<? extends Employee> aClass = employee.getClass();

        System.out.println(aClass.getName());
    }

    public static class Employee implements Cloneable {

        private String name;
        private int age;
        private int salary;
        private House house;
        private static int count = 1;

        Employee(String name, int age, int salary, House house) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.house = house;
        }

//      copy constructor
        public Employee(Employee employee) {
            this.name = employee.name;
            this.age = employee.age;
            this.salary = employee.salary;
            this.house = new House(employee.house.number);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println(count++);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    static class House {
        private int number;

        House(int number) {
            this.number = number;
        }
    }
}
