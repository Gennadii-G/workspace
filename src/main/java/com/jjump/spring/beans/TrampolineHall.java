package com.jjump.spring.beans;

import java.util.List;
import java.util.Set;

public class TrampolineHall {

    private List<Order> orders;
    private List<Discount> discounts;
    private List<Trampoline> tramlins;
    private int price;
    private String name;

    public TrampolineHall() {}

    public TrampolineHall(String name, List<Trampoline> tramlins, int price) {
        this.name = name;
        this.price = price;
    }

    public void setTramlins(List<Trampoline> tramlins) {
        this.tramlins = tramlins;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TrampolineHall: " +
                name + ", tramps: " +
                tramlins.size() + ", price:" +
                price;
    }
}
