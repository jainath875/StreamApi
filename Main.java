import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // int arr[] = {12, 45, 89, 23, 56, 78, 90};
        // int n = Arrays.stream(arr)
        //                 .boxed()
        //                 .distinct()
        //                 .sorted(Comparator.reverseOrder())
        //                 .skip(1)
        //                 .findFirst()
        //                 .orElse(null);
        // System.out.println(n);

        String str = "madam";
        // String result = new StringBuilder(str).reverse().toString();
        // if(str.equalsIgnoreCase(result)) {
        //     System.out.println("pallindrome");
        // } else {
        //     System.out.println("not");
        // }

        Boolean res = IntStream.range(0, str.length()/2)
                                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i -1));
        if(res) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        String input = "java stream api";

        String res1 = Arrays.stream(input.split(" "))
                        .map(word -> new StringBuilder(word).reverse().toString())
                        .collect(Collectors.joining(" "));
         System.out.println(res1);


        List<List<String>> namelist = Arrays.asList(
            Arrays.asList("Abhishek","Sipun","Suvnedu"),
            Arrays.asList("Swati","Saroj","Razia"),
            Arrays.asList("Dipa","Avinash","Dhanush")
        );

        List<String> flatList = namelist.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
        System.out.println(flatList);

        List<String> newNames = flatList.stream()
                                        .filter(name -> name.startsWith("S"))
                                        .toList();
        System.out.println(newNames);

    }
            
}