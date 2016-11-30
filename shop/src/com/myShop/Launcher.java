package com.myShop;

import com.myShop.db.StorageInFile;
import com.myShop.domain.Client;
import com.myShop.domain.Product;
import com.myShop.domain.Shop;
import com.myShop.ui.Dialog;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on 28.11.2016.
 */
public class Launcher {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        Shop shop = new Shop();
        shop.client = new Client();
        Map<String,Long> products = new HashMap<>();

        if(args.length == 0){
            shop.addProductInShop(new Product("perepel",500L));
            shop.addProductInShop(new Product("goose",800L));
            shop.addProductInShop(new Product("eagle",500L));
            shop.addProductInShop(new Product("peafowl",500L));
       }
        else{
           products = StorageInFile.readProducts(args[0]);
            for (Map.Entry<String, Long> entry : products.entrySet())
            {
                shop.addProductInShop(new Product(entry.getKey(),entry.getValue()));
            }
       }

        Dialog dialog = new Dialog(shop);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
