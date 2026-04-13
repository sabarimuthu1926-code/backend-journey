package week2_method_refrence_and_streams;
import java.util.Arrays;
public class MethodRefereneceExanple {

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args){

        String[] names = {"Sabari", "Muthu", "Ravichandran"};

            Arrays.stream(names).forEach(MethodRefereneceExanple::print);
    }
}
