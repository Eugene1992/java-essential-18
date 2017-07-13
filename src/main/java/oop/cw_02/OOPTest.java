package oop.cw_02;

public class OOPTest {
    public static void main(String[] args) {

        Employee ivan = new Employee("Ivan", 24, 12000);
        Employee anna = new Employee("Anna", 22, 7000);

        System.out.println(ivan.calcIncreasedValueSalaryByPeriod(1000, 6));
        System.out.println(anna.calcIncreasedPercentSalaryByPeriod(150, 3));

        ivan.setSalary(100);
        ivan.setSalary(100);
        ivan.setSalary(100);
        ivan.setSalary(100);
        ivan.setSalary(100);
        ivan.setSalary(100);
        ivan.setSalary(100);
        ivan.setSalary(100);
        ivan.setSalary(100);
        ivan.setSalary(100);


    }

}
