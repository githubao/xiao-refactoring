package me.xiao.learnjava.refactor;

/**
 * 正常的电影
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/9/21 20:45
 */

public class RegularPrice extends Price{
    @Override
    MovieType getPriceCode() {
        return MovieType.REGULAR;
    }

    @Override
    double getCharge(int daysRented) {
        double amount = 2;
        if (daysRented > 2){
            amount += (daysRented - 2) * 1.5;
        }
        return amount;
    }
}
