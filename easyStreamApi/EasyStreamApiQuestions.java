package easyStreamApi;

import java.util.Arrays;
import java.util.List;

public class EasyStreamApiQuestions {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);

        List<Integer> distinctValues = numbers.stream()
                .distinct()
                .toList();
        System.out.println("Distinct Values: " + distinctValues);   
            
    }

}
