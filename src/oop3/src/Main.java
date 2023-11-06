package oop3.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
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

        List<Ingredients> pjata1=new ArrayList<>();
        Ingredients ingredient1 = new Ingredients("brume",50,false);
        Ingredients ingredient2 = new Ingredients("domate",5,true);
        Ingredients ingredient3 = new Ingredients("kackavall",100,false);
        Ingredients ingredient4 = new Ingredients("proshute",80,false);
        pjata1.add(ingredient1);
        pjata1.add(ingredient2);
        pjata1.add(ingredient3);
        pjata1.add(ingredient4);
        dish1.setIngredients(pjata1);
        restaurant.eshteApoJoShendetshem(dish1);
    }
}