package task1;

/**
 * Created by sergey.kliepikov on 3/8/18.
 */
public class MenuRunner {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Soup", "good", 50);
        Dish dish2 = new Dish("Salad", "very good", 150);
        Dish dish3 = new Dish("Desert", "delicious", 250);

        Menu menu1 = new Menu("Food");
        menu1.addDish(dish1);
        menu1.addDish(dish2);
        menu1.addDish(dish3);

        System.out.println("The cheapest meal is " + menu1.getCheapestDish());

        Dish dish4 = new Dish("Whisky", "Scotish", 200);
        Dish dish5 = new Dish("Vodka", "Russian", 100);
        Dish dish6 = new Dish("Rom", "Cuban", 300);

        Menu menu2 = new Menu("Drinks");
        menu2.addDish(dish4);
        menu2.addDish(dish5);
        menu2.addDish(dish6);

        System.out.println("The cheapest drink is " + menu2.getCheapestDish());

    }
}
