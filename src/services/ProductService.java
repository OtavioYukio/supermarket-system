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
        Product newProduct = productManagerImp.save(product);
        System.out.println("Product saved successfully: " + newProduct);
    }

    public void findById(Integer id) {
        Product returnedProduct = productManagerImp.findById(id);
        if (returnedProduct == null) {
            throw new IllegalArgumentException("id " + id +" does not exist");
        }
    }
}
