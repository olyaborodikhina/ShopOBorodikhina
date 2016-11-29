package com.myShop.domain;

import com.myShop.domain.Client;
import com.myShop.domain.Order;
import com.myShop.domain.Product;
import com.myShop.exception.exNotFoundProduct;
import com.myShop.ui.Dialog;
import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by hp on 27.11.2016.
 */
public class Shop {
    public HashMap<Client,Order> orders = new HashMap<Client, Order>();
    public Client client = new Client();
    public ArrayList<Product> products = new ArrayList<Product>();
    public Order curOrder = new Order();

    public Order getOrder(Client client){
        return orders.get(client);
    }

    public void addToOrderInTransaction(Client client,Order order){
        orders.put(client,order);
        curOrder.addNewOrder();
        curOrder.addNewOrder();
    }

    public void addProductInOrder(Product product,int count){
        curOrder.orderItems.add(new OrderItem(product,count));
    }

    public void addProductInShop(Product product){
        products.add(product);
    }

    public long getSumOrder(){
        return curOrder.getSum();
    }

    public void buyProduct(Client client, Product product,int count){
        getOrder(client).addOrderItem(product,count);
    }

    public Product findProduct(String nameProduct) throws exNotFoundProduct {
        Product product = null;
        for(int i = 0; i < products.size();i++){
            if(products.get(i).getName().equals(nameProduct))
                product = products.get(i);
        }
        if(product == null)
            throw new exNotFoundProduct();
        return product;
    }

}
