package solid.SRP;

public class CartInvoicePrinter {
    private final Cart cart;

    public CartInvoicePrinter(Cart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        System.out.println("Printing invoice");
        for (Product product: cart.getProductList()) {
            System.out.println(product.getProductName());
        }
    }
}
