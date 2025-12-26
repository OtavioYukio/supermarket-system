package services;

import java.util.List;
import java.util.random.*;

import entities.Product;

public class ProductIDGenerator extends IDGenerator<Product> {
    @Override
    public void setUsageStatus(List<Product> products, Integer generatedId) {
        for (Product product : products) {
            if (product.getId().equals(generatedId)) {
                isUsing = true;
            }
        }
    }
}
