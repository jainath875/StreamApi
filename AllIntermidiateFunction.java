import java.util.Arrays;
import java.util.List;

public class AllIntermidiateFunction {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // fileter
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // map

        List<String> names = Arrays.asList("alice", "bob", "charlie");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // reduce --> Terminal Operation
        Integer sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
