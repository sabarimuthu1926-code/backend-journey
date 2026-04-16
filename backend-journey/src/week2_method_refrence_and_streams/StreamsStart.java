package week2_method_refrence_and_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsStart {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("Luffy","Zoro","Sanji");
        Stream<String> stream1 = arr.stream();
        stream1.forEach(System.out::println);

        String[] arr2 = {"One", "Two", "Three"};
        Stream<String> stream2 = Arrays.stream(arr2);
        stream2.forEach(System.out::println);

        Stream<Integer> stream3 = Stream.of(1,2,3);
        stream3.forEach(System.out::println);

        Stream<Integer> stream4 = Stream.iterate(1,n->n+1).limit(5);
       stream4.forEach(System.out::println);
    }
}
