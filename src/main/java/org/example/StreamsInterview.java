package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInterview {
//    String[] arr = new String[]{"Surya","Test","Surya"};
    int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 1};

//    Set<Integer> duplicates =
//            Arrays.stream(arr)
//                    .boxed()
//                    .collect(Collectors.groupingBy(
//                            Function.identity(),
//                            Collectors.counting()))
//                    .entrySet()
//                    .stream()
//                    .filter(e -> e.getValue() > 1)
//                    .map(Map.Entry::getKey)
//                    .collect(Collectors.toSet());



    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 1,5,1,1,1,1};

        Map<Integer, Double> s = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.averagingInt(x -> (int) x)));
        System.out.println(s);


    }
}
