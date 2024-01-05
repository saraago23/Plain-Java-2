package generics.u1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Doll doll1 = new Doll("barbie",50);
        Doll doll2 = new Doll("bratz",30);
        Doll doll3 = new Doll("American Idol",100);

        List<Doll> dolls = new ArrayList<>();
        dolls.add(doll1);
        dolls.add(doll2);
        dolls.add(doll3);

        for(Doll doll: dolls){
            System.out.println("Doll type: " + doll.getType() + " height: " + doll.getHeight());
        }

        Car car1 = new Car("Mercedes","red",180);
        Car car2 = new Car("Ferrari","red",250);
        Car car3 = new Car("Tesla","white",200);
        Car car4 = new Car("Lamborghini","yellow",300);

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        for(Car car:cars){
            System.out.println("Car brand: " + car.getBrand() + " ,color " + car.getColor() + " ,max speed " + car.getMaxSpeed());
        }

    }
}
