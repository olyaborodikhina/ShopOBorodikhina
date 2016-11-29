package com.myShop.com.myShop.db;

import com.myShop.domain.Product;

import java.io.*;
import java.util.*;

/**
 * Created by hp on 27.11.2016.
 */
public class StorageInFile {

    public static Map<String ,Long> readProducts(String fileName) throws IOException, ClassNotFoundException {
        Map<String,Long> products= new HashMap<String , Long>();
        String[] array;
        if (fileName == null) {
            throw new ClassNotFoundException();
        }

        try {
            LineNumberReader lineNumberReader =
                    new LineNumberReader(
                            new BufferedReader(
                                    new FileReader(fileName)));
            String line;
            while ((line = lineNumberReader.readLine()) != null) {
                array = line.split(",");
                Map map = fillInMap(array);
                products.putAll(map);
            }

            lineNumberReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    private static Map fillInMap(String[] array){
        Map<String, Long> map = new HashMap<String, Long>();
        String[] elem;
        int length = array.length;
        map.put(array[0], Long.parseLong(array[1]));
        return map;
    }

    public Product getProductById(int id) {
        return null;
    }
}
