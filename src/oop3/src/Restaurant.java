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

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        Customer customer1 = new Customer("lgj 1", "lola", "balla");
        Customer customer2 = new Customer("Lgj 9", "melisa", "balla");
        Customer customer3 = new Customer("Lgj 3", "ana", "balla");

        Dish dish1 = new Dish("pizza", 500);
        Dish dish2 = new Dish("supe", 300);
        Dish dish3 = new Dish("pasta", 450);
        Dish dish4 = new Dish("sallate", 250);
        Dish dish5 = new Dish("embelsire", 300);

        restaurant.vendosPorosi(new Dish[]{dish1, dish2, dish3}, customer1);
        restaurant.vendosPorosi(new Dish[]{dish3, dish4}, customer2);
        restaurant.vendosPorosi(new Dish[]{dish5, dish2}, customer3);


        Order order1 = restaurant.merrPorosiTeCustomer(customer1);


        if (order1 == null) {
            System.out.println("Nuk gjendet porosi per customer me id" + customer1.getNid());
        } else {
            System.out.println("Porosia u gjet: " + order1);
        }

        Dish[] dishesCustomer2 = restaurant.merrDishTeCustomer(customer2);
        System.out.println(customer2.getEmer() + " " + customer2.getMbiemer() + " ka porositur: "
        + Arrays.toString(dishesCustomer2));


        System.out.println("Porosine: " + order1 + " e ka bere ky klient: " +
                restaurant.shfaqCustomerTePorosise(order1));


        Order orderMeiShtrenjte = restaurant.shfaqPorosineMeTeShtrenjte();
        System.out.println("Porosia me e shtrenjte eshte: " + orderMeiShtrenjte);
    }


}
