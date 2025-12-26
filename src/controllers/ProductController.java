package controllers;

import java.util.Date;

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

    public void findById(Integer id) {
        productService.findById(id);
    }

    public void findAll() {
        productService.findAll();
    }

    public void updateById(Integer id, String name, Double price, String supplier, Integer quantityInStock,
    Date manufaturingDate, Date expirationDate) {
        Product product = new Product(name, price, supplier, quantityInStock, manufaturingDate, expirationDate);
        productService.updateById(id, product);
    }

}
