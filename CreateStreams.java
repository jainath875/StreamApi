import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("bob", "john");
        //List -> stream
        Stream<String> stream = names.stream();
        System.out.println(stream);


        String[] arr = {"bob", "john", "akash", "abhishek"};
        //Array -> stream
        Stream<String> stream1 = Arrays.stream(arr);

        //Stream of

        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        //Stream generate

        Stream<Double> doubleStream = Stream.generate(Math::random).limit(5);
    }
}
