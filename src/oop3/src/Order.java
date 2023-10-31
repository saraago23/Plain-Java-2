package oop3.src;

import java.util.Arrays;

public class Order {
    private int id;
    private static int counter = 0;
    private Dish[] dishes;
    private Customer customer;
    private double cmimi;

    public Order() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    @Override
    public String toString() {
        return "Klienti: " + customer + " Pjatat: " + Arrays.toString(dishes) + " Cmimi: " + cmimi;
    }

}
