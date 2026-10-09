package solid.SRP;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> productList;

    public Cart() {
        this.productList = new ArrayList<>();
    }

    public int getTotalPrice() {
        int total = 0;

        for (Product product: productList) {
            total += product.getProductPrice();
        }

        return (total);
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
