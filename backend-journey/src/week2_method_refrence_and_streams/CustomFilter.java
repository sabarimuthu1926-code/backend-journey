package week2_method_refrence_and_streams;

import java.util.stream.Stream;

public class CustomFilter {
    static String[] strArray = new String[]{"madam","radar","compac","racecar","on"};

    public static void main(String[] args) {
        Stream.of(strArray).filter(CustomFilter::isPalindrome).forEach(System.out::println);
    }

    public static boolean isPalindrome(String s){
        if(s.length()<=1){
            return true;
        }else{
            return (s.charAt(0) == s.charAt(s.length()-1)) &&
                    isPalindrome(s.substring(1,s.length()-1));
        }
    }
}
