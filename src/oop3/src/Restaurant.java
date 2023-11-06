package oop3.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant extends AbstractRestaurant {

    private static List<Order> orders = new ArrayList<>();

    @Override
    public void vendosPorosi(Dish[] dishes, Customer customer) {
        Order order = new Order();
        order.setId(Order.getCounter());
        order.setCustomer(customer);
        order.setDishes(dishes);
        double cmimiTotalOrderit = 0;
        for (int i = 0; i < order.getDishes().length; i++) {
            Dish dish = order.getDishes()[i];
            cmimiTotalOrderit += dish.getCmimi();
        }
        order.setCmimi(cmimiTotalOrderit);
        orders.add(order);

    }

    @Override
    public Order merrPorosiTeCustomer(Customer customer) {
        for (Order order : orders) {
            if (order.getCustomer().equals(customer)) {
                return order;
            }
        }
        return null;
    }

    @Override
    public Dish[] merrDishTeCustomer(Customer customer) {
        for (Order order : orders) {
            if (order.getCustomer().equals(customer)) {
                return order.getDishes();
            }
        }
        return null;
    }

    @Override
    public Customer shfaqCustomerTePorosise(Order order) {
        return order.getCustomer();
    }

    @Override
    public Order shfaqPorosineMeTeShtrenjte() {
        double max = Double.MIN_VALUE;
        Order maxOrder = null;
        for (Order order : orders) {
            if (order.getCmimi() > max) {
                max = order.getCmimi();
                maxOrder = order;
            }
        }
        return maxOrder;
    }

    @Override
    public void eshteApoJoShendetshem(Dish dish) {
        int healthyCounter = 0;
        int unhealthyCounter = 0;
        List<Ingredients> ingredients = dish.getIngredients();
        for (Ingredients i : ingredients) {
            if (i.isHealthy()) {
                healthyCounter++;
            } else {
                unhealthyCounter++;
            }
        }
        if (healthyCounter > unhealthyCounter) {
            System.out.println("Kjo pjate eshte e shendetshme");
        } else {
            System.out.println("Kjo pjate nuk eshte e shendetshme");
        }
       /* System.out.println("Pjata ne total ka: " +
                healthyCounter + " ingrediente te shendetshem nga: " + ingredients.size() + " ne total");*/
    }


}
