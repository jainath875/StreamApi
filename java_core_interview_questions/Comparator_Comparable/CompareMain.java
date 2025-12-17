package java_core_interview_questions.Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class CompareMain {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "1234567890", 3));
        employees.add(new Employee("Alice", "0987654321", 1));
        employees.add(new Employee("Bob", "5555555555", 2));
        System.out.println("Before Sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees);

        Collections.sort(employees, new idComparator());

        System.out.println("After Sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        ArrayList<Employee> employees2 = new ArrayList<>(employees);
        Collections.sort(employees2, new NameComparator());
        System.out.println("After Sorting by Name:");
        for (Employee emp : employees2) {
            System.out.println(emp);
        }
    }
}
