package intermediate_stream_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
        public static void main(String[] args) {
                Employee emp1 = new Employee("Alice", "HR", 60000);
                Employee emp2 = new Employee("Bob", "IT", 75000);
                Employee emp3 = new Employee("Charlie", "Finance", 80000);
                Employee emp4 = new Employee("Diana", "IT", 72000);

                ArrayList<Employee> employees = new ArrayList<>();
                employees.add(emp1);
                employees.add(emp2);
                employees.add(emp3);
                employees.add(emp4);

                List<Employee> sortedSalaryEmp = employees.stream()
                                .sorted(Comparator.comparing(Employee::getSalary))
                                .collect(Collectors.toList());

                sortedSalaryEmp.forEach(System.out::println);

                List<Person> persons = Arrays.asList(
                                new Person("John", 28),
                                new Person("Jane", 34),
                                new Person("Tom", 23),
                                new Person("Lucy", 29));

                double avegrageAge = persons.stream()
                                .mapToInt(Person::getAge)
                                .average()
                                .orElse(0);

                System.out.println("Average age: " + avegrageAge);

                List<Integer> numbers = Arrays.asList(3, 5, 2, 4, 6, 7, 9, 11, 13, 24, 15, 1, 2, 3, 13, 16, 16, 9, 4,
                                6);

                Map<Boolean, List<Integer>> partioned = numbers.stream()
                                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

                System.out.println("Even numbers: " + partioned.get(true));
                System.out.println("Odd numbers: " + partioned.get(false));

                List<Integer> combinedList = Stream.concat(partioned.get(true).stream(),
                                partioned.get(false).stream())
                                .collect(Collectors.toList());

                System.out.println("Combined List: " + combinedList);

                LinkedHashMap<Integer, Long> collect = numbers.stream()
                                .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()));

                System.out.println("Frequency Map: " + collect);

                List<String> stringList = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry", "apricot");

                Map<Integer, List<String>> stringByLength = stringList.stream()
                                .collect(Collectors.groupingBy(String::length));

                System.out.println("Strings grouped by length: " + stringByLength);

                Map<String, Double> averageSalaryByDept = employees.stream()
                                .collect(Collectors.groupingBy(Employee::getDepartment,
                                                Collectors.averagingDouble(Employee::getSalary)));

                System.out.println("Average Salary by Department: " + averageSalaryByDept);

                // Highest salary by department

                Map<String, Optional<Employee>> highestSalaryBydepartment = employees.stream()
                                .collect(Collectors.groupingBy(Employee::getDepartment,
                                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

                System.out.println("Highest Salary By Department: " + highestSalaryBydepartment);

                Map<String, Long> employeeCountByDepartment = employees.stream()
                                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

                System.out.println("Employee Count By Department: " + employeeCountByDepartment);

                List<String> departmentMoreThanOneEmployee = employeeCountByDepartment.entrySet()
                                .stream()
                                .filter(e -> e.getValue() >= 2)
                                .map(Map.Entry::getKey)
                                .collect(Collectors.toList());

                System.out.println("Departments with more than one employee: " + departmentMoreThanOneEmployee);

                Map<String, Double> maxAvegrageSalaryByDepartment = employees.stream()
                                .collect(Collectors.groupingBy(Employee::getDepartment,
                                                Collectors.averagingDouble(Employee::getSalary)));

                Map.Entry<String, Double> averageMaxEntry = maxAvegrageSalaryByDepartment.entrySet()
                                .stream()
                                .max(Map.Entry.comparingByValue())
                                .orElseThrow();

                System.out.println(averageMaxEntry);

                // Find most frequent character in a string
                String input = "banana";
                List<Character> characterStream = input.chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.toList());

                Character mostFrequent = characterStream.stream()
                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                                                Collectors.counting()))
                                .entrySet()
                                .stream()
                                .max(Map.Entry.comparingByValue())
                                .map(Map.Entry::getKey)
                                .orElseThrow();

                System.out.println(mostFrequent);

                //find first non repeating character
                String str = "swiss";

                Character result = str.chars()
                                        .mapToObj(c -> (char) c)
                                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                                        .entrySet()
                                        .stream()
                                        .filter(e -> e.getValue() == 1)
                                        .map(Map.Entry::getKey)
                                        .findFirst()
                                        .orElseThrow();

                System.out.println(result);
        }
}
