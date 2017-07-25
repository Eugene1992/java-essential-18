package oop.cw_09;

public class EqualsTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee1 = new Employee("Ivan", 22, 10000);
        Employee employee2 = new Employee("Ivan", 22, 10000);

        System.out.println(employee1.equals(employee2));

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
    }

    public static class Employee implements Cloneable {

        private String name;
        private int age;
        private int salary;

        Employee(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Employee employee = (Employee) o;

            if (age != employee.age) return false;
            if (salary != employee.salary) return false;
            if (name != null) {
                return name.equals(employee.name);
            } else {
                return employee.name == null;
            }
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            result = 31 * result + salary;
            return result;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    class Point {
        int x;
        int y;

        @Override
        public int hashCode() {
            return 31 * x + y;
        }
    }
//    new Point(25, 4) -> 614
//    new Point(4, 25) -> 149
//    new Point(10, 10) -> 321
//    new Point(1, 100) -> 131
}
