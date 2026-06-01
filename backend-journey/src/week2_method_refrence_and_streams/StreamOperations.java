package week2_method_refrence_and_streams;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Luffy", "Sanji", "Zoro", "Nami", "Sabo");
//        List<Integer> numbers = Arrays.asList(10,40,50,26, 21, 9, 9, 10, 21);
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

//        List<String> str =  Arrays.asList("Sabari Muthu", "Nivehda", "Luffy", "JoyBoy", "LuffyZoroSanjiNamiUsaopp");
//        int totalLength = str.stream().reduce(0,(a,b)->a+b.length(),Integer::sum);
//        System.out.println(totalLength);

        //       List<String> names = Arrays.asList("Luffy", "Sanji", "Zoro", "Nami", "Sabo");
//       List<Integer> numbers = Arrays.asList(10,40,50,26, 21, 9, 9, 10, 21);
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

//
//        Stream<String> myStream = Stream.of("Like","Kite","https://learnStrem.org");
//        myStream.filter(x->x.startsWith("http")).forEach(System.out::println);

//        Integer[] number = {1,2,3,4,5,6,7,8,9,10};
//        Stream.of(number).filter(x->x%2 ==0).forEach(System.out::println);

//        String[] data = {"I", "am", "gonna", "be", "a", "king", "of", "the", "pirates"};
//        AtomicInteger i = new AtomicInteger(0);
//        Stream.of(data).filter(x->i.getAndIncrement()%2==0).forEach(System.out::println);

//        int[] rawScores = {32, 85, 45, 90, 100, 12};
//        List<Integer> failedMarks = IntStream.of(rawScores).filter(a->a<50).boxed().collect(Collectors.toList());
//        System.out.println(failedMarks);
//
//        int sum = IntStream.rangeClosed(1,5).filter(a->a%2!=0).map(a->a*a).sum();
//        System.out.println(sum);
//
//        List<String> codes = IntStream.of(101,102,103).mapToObj(a->"Code ID: "+a).toList();
//        System.out.println(codes);

        Stream<String> st1 = Stream.of("Luffy", "Naruto", "Nami", "Nezuko", "Asta", "Ace", "Aegon");
        st1.filter(a->a.startsWith("A")).peek(System.out::println).map(String::toUpperCase).peek(System.out::println).count();
    }
}
