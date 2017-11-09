package com.epam.tcoi;

import java.util.*;
import static java.util.stream.Collectors.toList;

public class Task18 {

    // метод сортировки, принимающий компаратор, умеющий сравнивать людей по именам и список сотрудников
    private static void sortByName(comparatorByName comparator, List<Employee> list) {
        Collections.sort(list, comparator);
    }

    //  метод сортировки, принимающий компаратор, умеющий сравнивать объекты по весу и список сотрудников
    private static void sortByWeight (comparatorByWeight comparator, List<Employee> list) {
        Collections.sort(list, comparator);
    }

    //  метод, выбирающий работников у которых зп больше 65000 из исходного списка и помещающий в список сотрудников
    private static void selectEmployeesWithSalaryGreaterThen1000(List<Employee> src, List<Object> dst){
        for (Employee item: src) if (item.getSalary() > 65000) dst.add(item);
    }

    //  метод, выбирающий объекты у которых вес меньше 65 из исходного списка и помещающий в список физических объектов
    private static void selectObjectsWithWeightLessThen50(List<Employee> src, List<PhysicalObject> dst){
        for (Employee item: src) if (item.getWeight() < 65) dst.add(item);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(90, "Дмитрий", "Светличный", 80000),
                new Employee(60, "Алексей", "Мельников", 60000),
                new Employee(81, "Семен", "Паршин", 70000),
                new Employee(50, "Анна", "Яковлева", 65000)
        );

        sortByName(new comparatorByName(), employees);
        System.out.println(employees);

        sortByWeight(new comparatorByWeight(), employees);
        System.out.println(employees);

        List<Object> richGuys = new ArrayList<>();
        selectEmployeesWithSalaryGreaterThen1000(employees, richGuys);
        System.out.println(richGuys);

        List<PhysicalObject> lightObjects = new ArrayList<>();
        selectObjectsWithWeightLessThen50(employees, lightObjects);
        System.out.println(lightObjects);
    }


}
class comparatorByName implements Comparator <Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getLastName().equals(o2.getLastName()) ? o1.getFirstName().compareTo(o2.getFirstName())
                : o1.getLastName().compareTo(o2.getLastName());
    }
}

class comparatorByWeight implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getWeight(),o2.getWeight());
    }
}


abstract class PhysicalObject {

    private final double weight;

    PhysicalObject(double weight) {
        this.weight = weight;
    }

    /** @return Вес. */
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.valueOf(weight);
    }
}

class Person extends PhysicalObject {

    private final String firstName;
    private final String lastName;

    Person(double weight, String firstName, String lastName) {
        super(weight);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /** @return Имя. */
    public String getFirstName() {
        return firstName;
    }

    /** @return Фамилия. */
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return super.toString() + " " + firstName + " " + lastName;
    }
}

class Employee extends Person {

    private int salary;

    public Employee(double weight, String firstName, String lastName, int salary) {
        super(weight, firstName, lastName);
        this.salary = salary;
    }

    /** @return Зарплата. */
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + salary;
    }
}

