package me.xiao.learnjava.refactor;

/**
 * 新发行的电影的价格
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/9/21 20:35
 */

public class NewReleasePrice extends Price {
    @Override
    MovieType getPriceCode() {
        return MovieType.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequent(int dayRented) {
        if (dayRented > 1) {
            return 2;
        }
        return 1;
    }
}
