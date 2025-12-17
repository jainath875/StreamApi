import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EasyStreamCode {
    public static void main(String[] args) {
        // filter even number from a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        // filter number to their squares
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("Squared Numbers: " + squaredNumbers);

        // Square even number from a list
        List<Integer> evenNumbersSqured = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Even Numbers Squared: " + evenNumbersSqured);

        // find first element greater than 10
        List<Integer> num = Arrays.asList(1, 2, 21, 55, 5, 61, 17, 8, 9, 10);
        Optional<Integer> firstNumberGreaterThanTen = num.stream()
                .filter(n -> n > 10)
                .sorted()
                .findFirst();
        firstNumberGreaterThanTen.ifPresent(n -> System.out.println("First number greater than 10: " + n));

        // sum of number
        int sum = num.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of numbers: " + sum);

        // find max

        Optional<Integer> max = num.stream()
                .max((a, b) -> a.compareTo(b));
        // reduce(Integer::max)

        System.out.println("Max number: " + max.get());

        // sum of squares of even numbers
        Integer sumOfEvenSquares = num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of squares of even numbers: " + sumOfEvenSquares);
    }
}
