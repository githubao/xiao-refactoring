package me.xiao.learnjava.refactor;

/**
 * 儿童价格
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/9/21 20:43
 */

public class ChildrenPrice extends Price{
    @Override
    MovieType getPriceCode() {
        return MovieType.CHILDREN;
    }

    @Override
    double getCharge(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3){
            amount += (daysRented - 3) * 1.5;
        }
        return amount;
    }
}
