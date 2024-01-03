package com.example.file;

import com.example.item.Item;
import com.example.constant.Constant;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

import static com.example.item.Item.items;
import static com.example.file.FileSet.filename;

public class FileSave {
    public static void saveItemToFile() {
        JSONArray jsonArray = new JSONArray();
        for (Item item : items) {
            JSONObject itemJson = new JSONObject();
            itemJson.put("id", item.getId());
            itemJson.put("seller", item.getSeller());
            itemJson.put("itemName", item.getItemName());
            itemJson.put("price", item.getPrice());
            itemJson.put("dateTime", item.getDateTime());
            jsonArray.put(itemJson);
        }

        try (FileWriter file = new FileWriter(filename)) {
            file.write(jsonArray.toString(Constant.FOUR));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
