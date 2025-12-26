package controllers;

import java.util.Date;
import java.util.List;

import entities.Product;
import services.ProductService;

public class ProductController {
    private ProductService productService = new ProductService();

    public void save(String name, Double price, String supplier, Integer quantityInStock,
    Date manufaturingDate, Date expirationDate) {
        Product product = new Product(name, price, supplier, quantityInStock, manufaturingDate, expirationDate);
        productService.save(product);
    }

    public void save(String name, Double price, String supplier, Integer quantityInStock,
    Date manufaturingDate) {
        Product product = new Product(name, price, supplier, quantityInStock, manufaturingDate);
        productService.save(product);
    }

    public Product findById(Integer id) {
        return productService.findById(id);
    }

    public List<Product> findAll() {
        return productService.findAll();
    }

    public void updateById(Integer id, String name, Double price, String supplier, Integer quantityInStock,
    Date manufaturingDate, Date expirationDate) {
        Product product = new Product(name, price, supplier, quantityInStock, manufaturingDate, expirationDate);
        productService.updateById(id, product);
    }

    public void updateById(Integer id, String name, Double price, String supplier, Integer quantityInStock,
    Date manufaturingDate) {
        Product product = new Product(name, price, supplier, quantityInStock, manufaturingDate);
        productService.updateById(id, product);
    }

    public void deleteById(Integer id) {
        productService.deleteById(id);
    }
}
