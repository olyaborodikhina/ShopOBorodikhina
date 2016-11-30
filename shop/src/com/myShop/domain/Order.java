package com.myShop.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 27.11.2016.
 */
public class Order {

    public List<OrderItem> orderItems = new ArrayList<OrderItem>();

    public long getSum(){
        long result = 0;
        for (OrderItem orderItem:orderItems) {
            result+=orderItem.getSumOrderItem();
        }
        return result;
    }

    public void addNewOrder(){
        orderItems.clear();
    }

    public void addOrderItem(Product product, int count){

        orderItems.add(new OrderItem(product,count));

    }



}
