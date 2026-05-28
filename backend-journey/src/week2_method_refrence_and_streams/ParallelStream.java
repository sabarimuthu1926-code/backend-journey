package week2_method_refrence_and_streams;
import java.util.Arrays;
import java.util.List;


public class ParallelStream {
    public static void main(String[] args) {
        double[] taxAmounts = {1000.0, 550.0, 4000.0, 120.0, 850.0};
        Arrays.stream(taxAmounts).parallel().map(n-> n*0.15).forEachOrdered(a->{
            String currentThread = Thread.currentThread().getName();
            System.out.println(currentThread+ " gets "+ a);
        });

        List<Double> check = Arrays.stream(taxAmounts).boxed().toList();
        check.parallelStream().filter(a->a>600).forEachOrdered(a-> System.out.println(Thread.currentThread().getName()+ " "+ a));
    }
}
