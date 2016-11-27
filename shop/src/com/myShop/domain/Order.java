package com.myShop.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 27.11.2016.
 */
public class Order {
    public int idTransaction = 0;
    public List<OrderItem> orderItems = new ArrayList<OrderItem>();

    public long getSum(){
        long result = 0;
        for (OrderItem orderItem:orderItems) {
            result+=orderItem.getSumOrderItem();
        }
        return result;
    }

    public void addOrderItem(Product product, int count){
        orderItems.add(new OrderItem(product,count));
    }

//    public void addProducts(Client client,OrderItem orderItem){
//        this.client = client;
//        this.orderItems.add(orderItem);
//    }
//
//    public Order(Client client, ArrayList<OrderItem> orderItems){
//        idTransaction++;
//        this.client = client;
//        this.orderItems = orderItems;
//    }

    
}
