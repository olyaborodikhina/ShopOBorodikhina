package com.myShop.domain;

import com.myShop.domain.Client;
import com.myShop.domain.Order;
import com.myShop.domain.Product;
import com.myShop.ui.Dialog;
import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by hp on 27.11.2016.
 */
public class Shop {

    public HashMap<Client,Order> orders;
    public Client client = new Client();
    public ArrayList<Product> products = new ArrayList<Product>();

    public Shop(){}

    public Order getOrder(Client client){
        return orders.get(client);
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void buyProduct(Client client, Product product,int count){
        getOrder(client).addOrderItem(product,count);
    }


}
