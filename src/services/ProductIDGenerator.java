package services;

import java.util.List;
import java.util.Random;

import entities.Product;

public class ProductIDGenerator extends IDGenerator<Product> {
    @Override
    protected void setUsageStatus(List<Product> products, Integer generatedId) {
        for (Product product : products) {
            if (product.getId().equals(generatedId)) {
                isUsing = true;
            }
        }
    }

    @Override
    public Integer generateId(List<Product> products) {
        Random random = new Random();
        Integer generatedId = random.nextInt(1, Integer.MAX_VALUE);
        setUsageStatus(products, generatedId);
        while (isUsing) {
            generatedId = random.nextInt(1, Integer.MAX_VALUE);
            setUsageStatus(products, generatedId);
        }
        return generatedId;
    }
}
