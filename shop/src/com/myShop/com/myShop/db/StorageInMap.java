package com.myShop.com.myShop.db;

import com.myShop.domain.Product;

import java.util.Map;

/**
 * Created by hp on 27.11.2016.
 */
public class StorageInMap implements StorageProduct {
    private Map<Integer ,Product> productMap;

    public void addProduct() {

    }

    public Product getById(int id) {
        return null;
    }
}
