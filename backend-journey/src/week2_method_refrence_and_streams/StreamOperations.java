package week2_method_refrence_and_streams;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Luffy", "Sanji", "Zoro", "Nami", "Sabo");
        List<Integer> numbers = Arrays.asList(10,40,50,26, 21, 9, 9, 10, 21);
//        System.out.println("ForEach");
//        names.forEach(System.out::println);

        /*List<String> namesStartwithS = names.stream().filter(n->n.startsWith("S")).collect(Collectors.toList());
        String concateNames = namesStartwithS.stream().reduce("",(partialString,element) -> partialString + " "+ element);
        System.out.println("Concate Reduce"+ concateNames);

        double count = namesStartwithS.stream().count();
        System.out.println("Count og names start with S"+count);

        Optional<String> firstName = names.stream().findFirst();
        System.out.println("findfirst"+firstName);

        boolean checkAllNameisS = namesStartwithS.stream().allMatch(n->n.startsWith("S"));
        System.out.println("AllMatch"+checkAllNameisS);

        boolean anyName = names.stream().anyMatch(n->n.startsWith("U"));
        System.out.println("any Name starts as u "+ anyName);*/

       /* Optional<String> firstName = names.stream().filter(name->{
            System.out.println("Filtering Name: "+ name);
            return name.startsWith("S");
        }).map(name->{
            System.out.println("Mapping : "+name);
            return name.toUpperCase();
        }).findFirst();

        System.out.println("First name starting with S :"+ firstName.orElse("None"));*/

        /*List<Integer> afterDistinct = numbers.stream().distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(numbers);
        System.out.println(afterDistinct);*/

        List<String> str =  Arrays.asList("Sabari Muthu", "Nivehda", "Luffy", "JoyBoy", "LuffyZoroSanjiNamiUsaopp");
        int totalLength = str.stream().reduce(0,(a,b)->a+b.length(),Integer::sum);
        System.out.println(totalLength);
    }
}
