package DesignPattern.SpecificationPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Movie m1 = new Movie("DDLG", new Date(2021, 2, 28), 9.1, 101.23);
        Movie m2 = new Movie("K3G", new Date(1999, 3, 28), 8.9, 200.0);
        Movie m3 = new Movie("KGF1", new Date(2021, 4, 28), 9.5, 99.0);
        Movie m4 = new Movie("KGF2", new Date(2021, 6, 28), 9.1, 150.0);
        List<Movie> l = Arrays.asList(m1,m2,m3,m4);
        IsHighProfitMovie isHighProfitMovie = new IsHighProfitMovie();
        IsHighRatedMovie isHighRatedMovie = new IsHighRatedMovie();
        l.stream().filter(movie -> isHighProfitMovie.isSatisfied(movie) && isHighRatedMovie.isSatisfied(movie)).forEach(movie -> System.out.println(movie));
    }
}
