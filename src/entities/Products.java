package entities;

import java.util.Date;

public class Products {
    private Integer id;
    private String name;
    private Double price;
    private String supplier;
    private Integer quantityInStock;
    private Date manufacturingDate;
    private Date expirationDate;

    public Products(String name, Double price, String supplier,
        Integer quantityInStock, Date manufaturingDate, Date expirationDate
    ) {
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.quantityInStock = quantityInStock;
        this.manufacturingDate = manufaturingDate;
        this.expirationDate = expirationDate;
    }
}
