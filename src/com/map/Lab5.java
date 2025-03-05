package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lab5 {
    public static void main(String[]args){
        Map<String,String> mymap = new HashMap<>();
        
        mymap.put("sid", "101");
        mymap.put("name", "kaushik");
        mymap.put("phone","12345");
        mymap.put("city", "Blore");
        mymap.put("email", "kp@gmail.com");

        System.out.println(mymap);

        System.out.println("All keys");

        Set<String> mykeys = mymap.keySet();
        for(String key: mykeys){
            System.out.println(key);
        }

        System.out.println("All values");
        Collection<String> myvalues = mymap.values();
        for(String values:myvalues){
            System.out.println(values);
        }
    }
}
