import java.util.Arrays;
import java.util.stream.LongStream;

public class ParallelStream {
    public static void main(String[] args) {

        // long number = 5;
        // long result = factorial(number);
        // System.out.println("Factorial of " + number + " is: " + result);
        long[] longArray = new long[20000];
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = i + 1;
        }

        // calculate sum of factorial using sequential stream
        long startTime = System.currentTimeMillis();

        long totalSum = Arrays.stream(longArray)
                .map(ParallelStream::factorial)
                .sum();

        long endTime = System.currentTimeMillis();

        System.out.println("Total sum = " + totalSum + " Time Taken by sequential: " + (endTime - startTime) + " ms");

        // calculate sum of factorial using parallel stream
        long startTime1 = System.currentTimeMillis();

        long totalSum1 = Arrays.stream(longArray)
                .parallel()
                .map(ParallelStream::factorial)
                .sum();

        long endTime1 = System.currentTimeMillis();

        System.out.println("Total sum = " + totalSum1 + " Time Taken by sequential: " + (endTime1 - startTime1) + " ms");

    }

    public static long factorial(long number) {
        return LongStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
    }
}
