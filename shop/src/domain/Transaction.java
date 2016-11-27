package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 27.11.2016.
 */
public class Transaction {
    public int idTransaction = 0;
    public Client client = new Client();
    public List<OrderItem> orderItems = new ArrayList<OrderItem>();

    public void addProducts(Client client,OrderItem orderItem){
        this.client = client;
        this.orderItems.add(orderItem);
    }

    public Transaction(Client client, ArrayList<OrderItem> orderItems){
        idTransaction++;
        this.client = client;
        this.orderItems = orderItems;
    }

    public int getIdTransaction(){
        return idTransaction;
    }

    public Client getClient(){
        return client;
    }

    public List<OrderItem> getOrderItems(){
        return orderItems;
    }
}
