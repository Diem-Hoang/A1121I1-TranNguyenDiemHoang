package com.codegym.service;

import com.codegym.entity.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Vinamilk", 12000, "Sua", "Vina"));
        products.put(2, new Product(2, "Pessi", 8000, "Nuoc ngot", "Pessi"));
        products.put(3, new Product(3, "Aquafina", 22000, "Nuoc", "Pessi"));
        products.put(4, new Product(4, "Cocacola", 12000, "Nuoc ngot", "Coca"));
        products.put(5, new Product(5, "HaLan", 12000, "Sua", "Vina"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
//
//    @Override
//    public List<Product> searchProduct(String name) {
//        return products.();
//    }
}
