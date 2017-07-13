package oop.cw_01;

public class OOPTest {
    public static void main(String[] args) {

        int k = 10;
        Employee ivan = new Employee();
        ivan.salary = 12000;
        ivan.age = 21;
        ivan.name = "Ivan";
        ivan.address = new Address();
        ivan.address.streetName = "Lulumbu";
        ivan.address.buildingNum = 12;

        Employee petr = new Employee();
        petr.salary = 20000;
        petr.age = 32;
        petr.name = "Petr";

        Employee empMaxSalary = getEmpMaxSalary(ivan, petr);
        System.out.println(empMaxSalary.name);

        ivan.greeting();
        petr.greeting();
    }

    static Employee getEmpMaxSalary(Employee... employees) {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary > max.salary) {
                max = employees[i];
            }
        }
        return max;
    }
}
