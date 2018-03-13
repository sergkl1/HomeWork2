package task1;

import java.util.ArrayList;

/**
 * Created by sergey.kliepikov on 3/8/18.
 */
public class Menu {
    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        if (dishes.isEmpty()) throw new IllegalStateException("Empty Menu!");
        Dish cheapestDish = dishes.get(0);
        for (Dish dish: dishes) {
            if(dish.getPrice() < cheapestDish.getPrice()){
                cheapestDish = dish;
            }
        }
        return cheapestDish;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
