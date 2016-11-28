package com.myShop;

import com.myShop.domain.Client;
import com.myShop.domain.Product;
import com.myShop.domain.Shop;
import com.myShop.ui.Dialog;

/**
 * Created by hp on 28.11.2016.
 */
public class Launcher {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product prod = new Product("perepel",500);
        shop.addProduct(prod);
        shop.client = new Client();
        Dialog dialog = new Dialog(shop);

        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
