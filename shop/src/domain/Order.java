package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hp on 27.11.2016.
 */
public class Order {
    int id;
    private Client client = new Client();
    private Set<Product> products = new HashSet<Product>();
   // int count;
    long sum;

}
