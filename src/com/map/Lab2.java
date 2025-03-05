package com.map;

import java.util.HashMap;
import java.util.Map;

public class Lab2 {
    public static void main(String[] args){
        Map<String,String> mymap = new HashMap<>();
        
            mymap.put("sid", "101");
            mymap.put("name", "kaushik");
            mymap.put("phone","12345");
            mymap.put("email", "kp@gmail.com");
            mymap.put("city","Blore");

            System.out.println(mymap);
            System.out.println(mymap.get("sid"));
            System.out.println(mymap.get("phone"));
            System.out.println(mymap.get("city"));
            System.out.println(mymap.get("mycity"));

            System.out.println(mymap.containsKey("city"));
            System.out.println(mymap.containsKey("mycity"));

            System.out.println(mymap.containsValue("kaushik"));
            System.out.println(mymap.containsValue("kp"));
    }
}
