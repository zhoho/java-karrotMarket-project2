package com.example.file;

import com.example.item.Item;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.example.item.Item.items;
import static com.example.file.FileSet.filename;

public class FileLoad {
    public static void loadItemsFromFile() {
        try {
            String itemContents = new String(Files.readAllBytes(Paths.get(filename)));
            JSONArray jsonArray = new JSONArray(itemContents);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = jsonObject.getInt("id");
                String seller = jsonObject.getString("seller");
                String itemName = jsonObject.getString("itemName");
                int price = jsonObject.getInt("price");
                String dateTime = jsonObject.getString("dateTime");

                items.add(new Item(id, seller, itemName, price, dateTime));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
