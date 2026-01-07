package hardStreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import model.Employees;

//Find the most common first letter among all employee names

public class MostCommonFirstLetter {
    public static void main(String[] args) {
        List<Employees> employees = List.of(
                new Employees(1, "John", "IT", 60000),
                new Employees(2, "Alice", "HR", 55000),
                new Employees(3, "Bob", "IT", 75000),
                new Employees(4, "Carol", "HR", 70000),
                new Employees(5, "David", "Finance", 65000),
                new Employees(6, "Eve", "IT", 80000),
                new Employees(7, "Frank", "Finance", 64000),
                new Employees(8, "Ala", "Operations", 44000));

        Optional<Map.Entry<Character, Long>> max = employees.stream()
                .map(e -> e.getName().charAt(0))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        // System.out.println(charFreq);

        // Optional<Map.Entry<Character, Long>> max = charFreq.entrySet().stream()
        // .max(Map.Entry.comparingByValue());

        System.out.println(max.get());

        // Find average of elements for every 3 sliding window.

        List<Integer> input = Arrays.asList(4, 8, 15, 16, 23, 42);

        int window = 4;

        List<Double> list = IntStream.range(0, (input.size() - (window - 1)))
                .mapToObj(i -> input.subList(i, i + window))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0))
                .toList();

        System.out.println(list);

    }
}
