package com.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab8 {
    public static void main(String[] args){
        Map<String,String> mymap = new TreeMap<>();
        mymap.put("sid", "101");
        mymap.put("name", "kaushik");
        mymap.put("phone","12345");
        mymap.put("city", "Blore");
        mymap.put("email", "kp@gmail.com");
        mymap.put("myjlc", null);

        //mymap.put(null,"myjlc");

        mymap.put("kp", null);
        mymap.put("kp1", null );

        System.out.println(mymap);


        System.out.println("---All keys----");

        Set<String> mykeys = mymap.keySet();
        for(String key: mykeys){
            System.out.println(key);
        }
    }
}
