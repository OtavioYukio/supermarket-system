package services;

import entities.Product;
import repositories.CrudRepository;
import repositories.ProductManagerImp;

public class ProductService {
    CrudRepository<Product> productManagerImp = new ProductManagerImp();

    public void save(Product product) {
        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("Invalid product price");
        }
        if (product.getQuantityInStock() < 0) {
            throw new IllegalArgumentException("Invalid quantity of products in stock");
        }
        if (product.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid product name");
        }
        productManagerImp.save(product);
    }
}
