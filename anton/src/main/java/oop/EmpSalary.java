package oop;

/**
 * Created by Kate on 09.07.2017.
 */
public class EmpSalary {
    public static void main(String[] args) {
        Employee alex = new Employee();
        alex.salary = 3000;
        alex.age = 20;
        alex.name = "Alex";
        alex.address = new Address();
        alex.address.streetName = "Borshaga";
        alex.address.buildingNum = "25";
        Employee anton = new Employee();
        anton.salary = 50000;
        anton.age = 24;
        anton.name = "Anton";
        anton.address = new Address();
        anton.address.streetName = "Shuliavka";
        anton.address.buildingNum = "7";
        Employee sergei = new Employee();
        sergei.salary = 7000;
        sergei.age = 26;
        sergei.name = "Sergei";
        sergei.address = new Address();
        sergei.address.streetName = "Trojaga";
        sergei.address.buildingNum = "15";
        Employee maxim = new Employee();
        maxim.salary = 9000;
        maxim.age = 22;
        maxim.name = "Maxim";
        maxim.address = new Address();
        maxim.address.streetName = "KPI";
        maxim.address.buildingNum = "17";
        Employee victor = new Employee();
        victor.salary = 22000;
        victor.age = 24;
        victor.name = "Victor";
        victor.address = new Address();
        victor.address.streetName = "Akademika Paladina";
        victor.address.buildingNum = "13";
        int sumSalary = getSumSalary(new Employee[]{alex, anton, sergei, maxim, victor});
        System.out.print(sumSalary + " Sum");
        System.out.println();
        increaseSalary(new Employee[]{alex, anton, sergei, maxim, victor});
        System.out.print(alex.salary + " Increased to 25%");
        System.out.println();
        getEmpStreetName(new Employee[]{alex, anton, sergei, maxim, victor}, "KPI");
    }

    static int getSumSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = employees[i].salary + sum;
        }
        return sum;
    }
    static void increaseSalary(Employee[] employees) {

        int average = getSumSalary(employees) / employees.length;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary < average){
                employees[i].salary = (int) (employees[i].salary * 1.25);
            }
        }
    }
    static void getEmpStreetName(Employee[] employees, String streetName){
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].address.streetName.equals(streetName)){
                System.out.println(employees[i].name);
            }

        }
    }
}
