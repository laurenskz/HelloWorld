package com.laurensoptzandt.helloworld;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Laurens on 7-6-2015.
 */
public class ItemDatabase {

    private JSONObject items;


    public ItemDatabase(JSONObject items){
        this.items = items;
    }

    public ArrayList<String> getPossibleKeys(String typed){
        ArrayList<String> toReturn = new ArrayList<>();

        Iterator<String> keys = items.keys();
        while(keys.hasNext()){
            String key = keys.next();
            if(key.startsWith(typed)){
                toReturn.add(key);
            }
        }
        return toReturn;
    }

    public JSONObject getItems() {
        return items;
    }
}
