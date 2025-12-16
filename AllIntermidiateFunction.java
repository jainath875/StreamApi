import java.util.Arrays;
import java.util.Comparator;
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

        // flatMap
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f"));

        listOfLists.stream()
                .flatMap(list -> list.stream()) // Collection::stream
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // peek (it doesn't modified the original stream)
        numbers.stream()
                .map(n -> n * n)
                .peek(System.out::println)
                .toList();

        // distinct
        numbers.stream()
                .distinct()
                .toList();

        //sorted
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "cherry");
        words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList()
                .forEach(System.out::println);

        //skip
        numbers.stream()
                .skip(2)
                .toList()
                .forEach(System.out::println);
    }
}
