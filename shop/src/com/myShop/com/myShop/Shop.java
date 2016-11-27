package com.myShop.com.myShop;

import com.myShop.domain.Client;
import com.myShop.domain.Order;
import com.myShop.domain.Product;
import com.myShop.ui.Dialog;
import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;

/**
 * Created by hp on 27.11.2016.
 */
public class Shop {
    public HashMap<Client,Order> orders;

    public Order getOrder(Client client){
        return orders.get(client);
    }

    public void buyProduct(Client client, Product product,int count){
        getOrder(client).addOrderItem(product,count);
    }

    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
