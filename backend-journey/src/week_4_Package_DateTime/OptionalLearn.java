package week_4_Package_DateTime;

import java.util.Optional;

public class OptionalLearn {
    public static void main(String[] args) {
        String emptyCheck = null;
        String valueCheck = "93930";
        Optional<String> option1 = Optional.ofNullable(emptyCheck);
        Optional<String> option2 = Optional.ofNullable(valueCheck);
        System.out.println(option1);
        System.out.println(option2);

        Optional<Integer> option3 = Optional.of(435);
        Optional<Integer> option4 = Optional.empty();
        option3.ifPresentOrElse(
                (value)
                        -> {System.out.println(""+value);},
                ()
                -> {
                    System.out.println("The given value is empty");
                }
        );

        option4.ifPresentOrElse(
                (value)
                ->{
                    System.out.println(value);
                },
                ()
                -> {
                    System.out.println(option4);
                }
        );

        System.out.println("Value: "+option4.orElseGet(
                ()-> (int)(Math.random()*10)
        ));

        System.out.println("Filtered value"+ option3.filter(
                (num)-> {return num%2 ==0;}
        ));

        System.out.println(option3.hashCode());
        System.out.println(option4.hashCode());
        System.out.println(option2.hashCode());
    }
}
