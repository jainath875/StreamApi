import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalFuntion {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenSquaredList = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(evenSquaredList);

        // min
        Optional<Integer> min = list.stream()
                .min(Comparator.naturalOrder());
        System.out.println(min.get());

        // max
        Optional<Integer> max = list.stream()
                .max(Comparator.naturalOrder());
        System.out.println(max.get());

        // findFirst

        Optional<Integer> findFirstEvenValue = list.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println(findFirstEvenValue.get());

        // anyMatch

        boolean b = list.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(b);

        // count
        Long count = list.stream()
                .count();
        System.out.println(count);

        //sum
        int sum = list.stream()
                        .mapToInt(Integer::intValue)
                        .sum();
        System.out.println(sum);
    }
}
