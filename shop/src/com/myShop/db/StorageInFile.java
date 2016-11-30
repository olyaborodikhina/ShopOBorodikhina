package com.myShop.db;

import com.myShop.domain.Product;
import com.myShop.exception.ProductNotFoundInFileException;

import java.io.*;
import java.util.*;

/**
 * Created by hp on 27.11.2016.
 */
public class StorageInFile {

    public static Map<String ,Long> readProducts(String fileName) throws IOException, IllegalAccessException{
        Map<String,Long> products = new HashMap<String , Long>();

        if (fileName == null) {
            throw new IllegalArgumentException();
        }

        LineNumberReader lineNumberReader = null;
        try {
            lineNumberReader =
                    new LineNumberReader(
                            new BufferedReader(
                                    new FileReader(fileName)));
            String line;

            while ((line = lineNumberReader.readLine()) != null) {
                String[] array = line.split(",");
                Map<String, Long> map = new HashMap<String, Long>();
                int length = array.length;
                if(length == 2) {
                    map.put(array[0], Long.parseLong(array[1]));
                    products.putAll(map);
                }else
                    throw new ProductNotFoundInFileException();

            }

            lineNumberReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ProductNotFoundInFileException e) {
            e.printStackTrace();
        } finally {
            if(lineNumberReader != null) {
                lineNumberReader.close();
            }
        }
        return products;
    }
}
