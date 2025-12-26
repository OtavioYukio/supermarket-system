package entities;

import java.util.Date;

import controllers.ProductController;
import services.ProductIDGenerator;

public class Product {
    private Integer id;
    private String name;
    private Double price;
    private String supplier;
    private Integer quantityInStock;
    private Date manufacturingDate;
    private Date expirationDate;

    ProductIDGenerator productIDGenerator = new ProductIDGenerator();
    ProductController productController = new ProductController();

    public Product(String name, Double price, String supplier,
        Integer quantityInStock, Date manufaturingDate, Date expirationDate
    ) {
        this.id = productIDGenerator.generateId(productController.findAll());
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.quantityInStock = quantityInStock;
        this.manufacturingDate = manufaturingDate;
        this.expirationDate = expirationDate;
    }

    public Product(String name, Double price, String supplier,
        Integer quantityInStock, Date manufaturingDate
    ) {
        this.id = productIDGenerator.generateId(productController.findAll());
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.quantityInStock = quantityInStock;
        this.manufacturingDate = manufaturingDate;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "{" +
        "id=" + id +
        ", name=" + name +
        ", price=" + price +
        ", supplier=" + supplier +
        ", quantityInStock=" + quantityInStock +
        ", manufacturingDate=" + manufacturingDate +
        ", expirationDate=" + expirationDate +
        "}"; 
    }
}
