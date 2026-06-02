package week2_method_refrence_and_streams;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SpliteratorCheck {
    public static <T> Stream<T> convertIteratorToSpliteratortoStream(Iterable<T> it){
        Spliterator<T> t1 = it.spliterator();
        return StreamSupport.stream(t1,false);
    }
    public static void main(String[] args) {
        Iterable<Integer> it = Arrays.asList(1,2,3,4,5);
        Stream<Integer> st = convertIteratorToSpliteratortoStream(it);
        st.forEach(System.out::println);
    }
}
