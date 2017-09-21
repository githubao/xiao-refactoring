package me.xiao.learnjava.refactor;

/**
 * 关于价格的抽象类
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/9/21 20:33
 */

public abstract class Price {
    abstract MovieType getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequent(int dayRented) {
        return 1;
    }

}
