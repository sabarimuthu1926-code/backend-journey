package week2_method_refrence_and_streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertArrListToHashMap {
    public static void main(String[] args) {
        List<String> anime = new ArrayList<>();
        anime.add("One Piece");
        anime.add("Bleach");
        anime.add("Naruto");
        anime.add("Dragon Ball Z");

        System.out.println(anime);

       HashMap<String,Integer> wordCountMap =  anime.stream().collect(Collectors.toMap(Function.identity(),String::length,(e1,e2)-> e1, HashMap::new));
        System.out.println(wordCountMap);
    }
}
