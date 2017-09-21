package me.xiao.learnjava.refactor;

/**
 * 电影类型
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/9/21 20:36
 */

public class Movie {

    private String title;
    private Price price;

    public Movie(String title, Price price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public double getFrequent(int daysRented) {
        return price.getFrequent(daysRented);
    }
}
