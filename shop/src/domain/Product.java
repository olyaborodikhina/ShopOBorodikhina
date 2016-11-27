package domain;

/**
 * Created by hp on 27.11.2016.
 */
public class Product {
    int idProduct;
    String name = "";
    long price = 0;

    public Product(){}

    public Product(String name, long price){
        this.name = name;
        this.price = price;
    }

    public long getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
