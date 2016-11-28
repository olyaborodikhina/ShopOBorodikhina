package com.myShop.com.myShop.db;

import com.myShop.domain.Product;

import java.util.List;

/**
 * Created by hp on 28.11.2016.
 */
public interface StorageProduct {
    public void addProduct();
    public Product getById(int id);
}
