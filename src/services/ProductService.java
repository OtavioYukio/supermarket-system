package services;

import java.util.List;

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

    public Product findById(Integer id) {
        Product returnedProduct = productManagerImp.findById(id);
        if (returnedProduct == null) {
            throw new IllegalArgumentException("id " + id +" does not exist");
        }
        return returnedProduct;
    }

    public List<Product> findAll() {
        List<Product> returnedProducts = productManagerImp.findAll();
        return returnedProducts;
    }

    public void updateById(Integer id, Product newProduct) {
        if (newProduct.getPrice() <= 0) {
            throw new IllegalArgumentException("Invalid product price");
        }
        if (newProduct.getQuantityInStock() < 0) {
            throw new IllegalArgumentException("Invalid quantity of products in stock");
        }
        if (newProduct.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid product name");
        }
        Product returnedProduct = productManagerImp.updateById(id, newProduct);
        if (returnedProduct == null) {
            throw new IllegalArgumentException("id" + id + "does not exist");
        }
        System.out.println("Product updated successfully: " + returnedProduct);
    }

    public void deleteById(Integer id) {
        Product returnedProduct = productManagerImp.deleteById(id);
        if (returnedProduct == null) {
            throw new IllegalArgumentException("id" + id + "does not exist");
        }
        System.out.println("Product deleted successfully: " + returnedProduct);
    }
}
