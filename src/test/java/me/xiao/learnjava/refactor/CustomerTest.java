package me.xiao.learnjava.refactor;


import org.junit.Test;

/**
 * 单元测试
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/9/21 21:10
 */

public class CustomerTest {
    private static final Movie SPIDER_MAN = new Movie("spider man", new ChildrenPrice());
    private static final Movie STAR_WARS = new Movie("star wars", new RegularPrice());
    private static final Movie AVATAR = new Movie("avatar", new NewReleasePrice());

    private static final Customer customer = new Customer("xiao");

    @Test
    public void shouldDoSth() {
        customer.addRental(new Rental(SPIDER_MAN, 1));
        customer.addRental(new Rental(STAR_WARS, 2));
        customer.addRental(new Rental(AVATAR, 3));

        System.out.println(customer.htmlStatement());
    }

}