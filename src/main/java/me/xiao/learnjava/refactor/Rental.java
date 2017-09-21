package me.xiao.learnjava.refactor;

/**
 * 租金
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/9/21 20:46
 */

public class Rental {
    Movie movie;
    private int daysRented;

    public Rental() {
    }

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    public double getFrequent() {
        return movie.getFrequent(daysRented);
    }
}
