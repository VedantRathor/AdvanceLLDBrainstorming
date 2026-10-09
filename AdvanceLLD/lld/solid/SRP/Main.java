package solid.SRP;

public class Main {
    public static void main(String []varargs) {
        System.out.println("SRP");

        Cart cart = new Cart();

        cart.addProduct(new Product(101, "Mango", 50));
        cart.addProduct(new Product(212, "Banana", 25));
        cart.addProduct(new Product(103, "Apple", 90));

        System.out.println("Total price: " + cart.getTotalPrice());

        CartInvoicePrinter cartInvoicePrinter = new CartInvoicePrinter(cart);
        cartInvoicePrinter.printInvoice();

        CartDBPersistence cartDBPersistence = new CartDBPersistence(cart);
        cartDBPersistence.saveTODB();
    }
}
