package easyStreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EasyStreamApiQuestions {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);

        // first Approach
        List<Integer> distinctValues = numbers.stream()
                .distinct()
                .toList();
        System.out.println("Distinct Values: " + distinctValues);

        // second Approach -- HashSet does not maintain order
        Set<Integer> distinctValues2 = numbers.stream()
                .collect(Collectors.toSet());
        System.out.println("Distinct Values using Set: " + distinctValues2);

        // average of numbers

        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Average: " + avg);

        List<Integer> sortedInAccending = numbers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted in Accending Order: " + sortedInAccending);

        List<Integer> sortedInDecending = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted in Descending Order: " + sortedInDecending);

        List<String> fruits = Arrays.asList("apple", "banana", "avocado", "grape", "apricot", "blueberry");

        Long aFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .count();
        ;
        System.out.println("Fruits starting with 'a': " + aFruits);

        String collect = fruits.stream()
                .collect(Collectors.joining(","));
        System.out.println("Joined Fruits: " + collect);

        boolean match = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("All numbers are positive: " + match);

        boolean match1 = numbers.stream()
                .anyMatch(n -> n % 3 == 0);
        System.out.println("Any number divisible by 3: " + match1);

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)

        );

        List<Integer> list = listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("Flattened List: " + list);

        int secondLargest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println("Second Largest Number: " + secondLargest);
    }

}
