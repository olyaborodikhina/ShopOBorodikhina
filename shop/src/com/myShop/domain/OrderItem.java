package com.myShop.domain;


/**
 * Created by hp on 27.11.2016.
 */
public class OrderItem {
    public int idOrderItem = 0;
    public Product product;
    public int count = 0;

    OrderItem(){}

    public OrderItem(Product product, int count){
        this.product = product;
        this.count = count;
    }

    public long getSumOrderItem(){
        return this.product.price * count;
    }

    public void setCount(int count){
        this.count = count;
    }


}
