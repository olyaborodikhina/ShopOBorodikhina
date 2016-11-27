package com.myShop.domain;


/**
 * Created by hp on 27.11.2016.
 */
public class OrderItem {

    public int idOrderItem = 0;
    public static Product product = new Product();
    public static int count = 0;

    OrderItem(){}

    public OrderItem(Product product, int count){
        this.product = product;
        this.count = count;

    }

    public long getSumOrderItem(){
        return this.product.price * count;
    }


}
