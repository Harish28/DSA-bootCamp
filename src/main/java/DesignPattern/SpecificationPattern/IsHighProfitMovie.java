package DesignPattern.SpecificationPattern;

public class IsHighProfitMovie implements ISpecification<Movie>{

    private final double profit = 100;
    @Override
    public boolean isSatisfied(Movie movie) {
        return movie.getProfit() >= profit;
    }
}
