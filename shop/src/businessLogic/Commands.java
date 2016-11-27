package businessLogic;

import domain.Client;
import domain.OrderItem;
import domain.Product;

import java.util.List;

/**
 * Created by hp on 27.11.2016.
 */
public class Commands {

   private static Client client = new Client();


    public static Client getClient(String name, String surname, String telephone, String address){
        Commands.client.setName(name);
        Commands.client.setSurname(surname);
        Commands.client.setAddress(address);
        Commands.client.setNumberTelephone(telephone);
        return client;
    }

    public static void addProduct(Product product, int count){
        OrderItem.product = product;
        OrderItem.count = count;
    }

}
