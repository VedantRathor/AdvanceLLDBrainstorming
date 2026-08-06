package SOLID.SRP;

public class CartDBPersistence {
    private final Cart cart;

    public CartDBPersistence(Cart cart) {
        this.cart = cart;
    }

    public void saveTODB() {
        System.out.println("Saved to DB");
    }
}
