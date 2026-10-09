package lld.FoodDelivery.Order;

import lld.FoodDelivery.Payment.Payment;
import lld.FoodDelivery.Restaurant.Restaurant;
import lld.FoodDelivery.User.User;

public class Order {
    private static int counter = 0;
    private Integer orderId;
    private User user;
    private Restaurant restaurant;
    private OrderType orderType;
    private final Payment payment;

    public Order(User user, Restaurant restaurant, OrderType orderType, Payment payment) {
        counter ++;
        this.orderId = counter;
        this.user = user;
        this.restaurant = restaurant;
        this.orderType = orderType;
        this.payment = payment;
    }

    public boolean pay() {
        System.out.println("Paying for total: " + this.user.getCart().getTotal());
        payment.pay();
        return true;
    }
}
