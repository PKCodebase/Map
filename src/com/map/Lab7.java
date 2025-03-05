package com.map;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;

public class Lab7 {
    public static void main(String[]args){
        Map<String,String> mymap = new LinkedHashMap<>();

        mymap.put("sid", "101");
        mymap.put("name", "kaushik");
        mymap.put("phone","12345");
        mymap.put("city", "Blore");
        mymap.put("email", "kp@gmail.com");
        mymap.put(null, null);

        System.out.println(mymap);

        System.out.println("---All keys----");
        
        Set<String> mykeys = mymap.keySet();
        for(String key: mykeys){
            System.out.println(key);
        }
    }
}
