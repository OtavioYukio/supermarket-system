package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductManagerImp implements CrudRepository<Product> {
    private List<Product> products = new ArrayList<>();
    
    public Product save(Product product) {
        products.add(product);
        return product;
    }

    public Product findById(Integer id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
