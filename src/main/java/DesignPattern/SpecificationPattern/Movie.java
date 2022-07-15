package DesignPattern.SpecificationPattern;

import java.util.Date;

public class Movie {
    private String name;
    private Date dateTime;
    private Double rating;
    private Double profit;

    public Movie(String name, Date dateTime, Double rating, Double profit) {
        this.name = name;
        this.dateTime = dateTime;
        this.rating = rating;
        this.profit = profit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", dateTime=" + dateTime +
                ", rating=" + rating +
                ", profit=" + profit +
                '}';
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }
}
