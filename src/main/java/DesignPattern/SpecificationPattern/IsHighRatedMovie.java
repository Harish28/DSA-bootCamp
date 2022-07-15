package DesignPattern.SpecificationPattern;

public class IsHighRatedMovie implements ISpecification<Movie>{
    private final double rating = 9.0;
    @Override
    public boolean isSatisfied(Movie movie) {
        return movie.getRating() >= rating;
    }
}
