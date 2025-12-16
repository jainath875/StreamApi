import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TerminalByEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 3000),
            new Employee("Bob", "IT", 6000),
            new Employee("Charlie", "HR", 2000),
            new Employee("Dave", "IT", 10000),
            new Employee("Eve", "Finance", 5000)
        );

        Map<String, List<Employee>> employeesByDepartment = employees.stream()
			                                    .collect(Collectors.groupingBy(Employee::getDepartment));

        employeesByDepartment.forEach((department, employeeList) -> {
		            System.out.println("Department: " + department);
		            employeeList.forEach(System.out::println);
        });

        Map<Boolean, List<Employee>> partitionedBySalary = employees.stream()
			.collect(Collectors.partitioningBy(employee -> employee.getSalary() > 5000));
			
		
        System.out.println("Salary greater than 5000 :");
        partitionedBySalary.get(true).forEach(System.out::println);

        System.out.println("Salary less than or equal to 5000 :");
        partitionedBySalary.get(false).forEach(System.out::println);
    }
}
