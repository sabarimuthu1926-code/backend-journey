package week3_comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Filter {
    public static void main(String[] args) {
        Movie m1 = new Movie("Fight Club",9, 2001);
        Movie m2 = new Movie("Interstellar", 8.9,2014);
        Movie m3 = new Movie("Inception",9.2, 2010);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        Collections.sort(movies);
        for (Movie m : movies){
            System.out.println(m.getName() +" "+ m.getYear() +" "+ m.getRating());
        }
    }
}
