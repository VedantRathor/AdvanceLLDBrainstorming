package lld.FoodDelivery;

import lld.FoodDelivery.Menu.Menu;
import lld.FoodDelivery.Order.Order;
import lld.FoodDelivery.Order.OrderType;
import lld.FoodDelivery.Payment.CashOnDelivery;
import lld.FoodDelivery.Restaurant.Restaurant;
import lld.FoodDelivery.User.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FoodDelivery app = new FoodDelivery();
        User user = new User("Vedant", "vedantrathore6@gmail.com");

        List<Restaurant> restaurants = app.getByLocation("Pune");
        Restaurant restaurant = null;

        for (Restaurant res : restaurants) {
            if (res.getName() == "MINDLL") {
                restaurant = res;
                break;
            }
        }

        assert restaurant != null;
        app.selectRestaurant(user, restaurant);

        app.addItem(user, new Menu("102", "Coffee", 150.33));
        app.addItem(user, new Menu("105", "Idli", 80.00));

        Order order = app.checkout(user, restaurant, new CashOnDelivery(), OrderType.HOME_DELIVERY);

        if (order.pay()) {
            System.out.println("PAYMENT SUCCESSFUL");
        }

    }
}
