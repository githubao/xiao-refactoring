package me.xiao.learnjava.refactor;

import java.util.ArrayList;
import java.util.List;

/**
 * 顾客类
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/9/21 20:32
 */

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        return "";
    }

    public String htmlStatement() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("<h1> Rental record for <b>%s</b></h1>\n", getName()));
        for (Rental rental : rentals) {
            sb.append(String.format("<p>%s\t%s</p>\n", rental.getMovie().getTitle(), rental.getCharge()));
        }
        sb.append(String.format("<p>Amount owed is <b>%s</b></p>\n", getTotalCharge()));
        sb.append(String.format("<p>You earned is <b>%s</b></p>\n", getFrequent()));

        return sb.toString();
    }

    public double getTotalCharge() {
        double total = 0;
        for (Rental rental : rentals) {
            total += rental.getCharge();
        }
        return total;
    }

    public double getFrequent() {
        double total = 0;
        for (Rental rental : rentals) {
            total += rental.getFrequent();
        }
        return total;
    }
}
