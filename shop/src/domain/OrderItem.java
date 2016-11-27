package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by hp on 27.11.2016.
 */
public class OrderItem {

    public int idOrderItem = 0;
    public static Product product = new Product();
    public static int count = 0;
    public long sum = 0;

    OrderItem(){}

    public OrderItem(Product product, int count){
        this.product = product;
        this.count = count;
        this.sum = this.product.price * count;
    }

    public long getSumOrderItem(){
        return sum;
    }


}
