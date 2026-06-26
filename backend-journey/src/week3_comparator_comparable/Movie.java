package week3_comparator_comparable;

public class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) {
        return Integer.compare(this.year , o.year);
    }

    public String getName(){
        return this.name;
    }

    public  double getRating(){
        return this.rating;
    }

    public int getYear(){
        return this.year;
    }
}
