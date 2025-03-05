package com.map;

import java.util.HashMap;
import java.util.Map;

public class Lab3 {
    public static void main(String[] args){
        Map<String,String> mymap = new HashMap<>();
            mymap.put("sid", "101");
            mymap.put("name", "kaushik");
            mymap.put("phone","12345");
            mymap.put("email", "kp@gmail.com");
            mymap.put("city", "Blore");

            System.out.println(mymap);
            System.out.println(mymap.remove("city"));
            System.out.println(mymap.remove("email"));
            System.out.println(mymap);
            System.out.println(mymap.remove("mycity"));
            System.out.println(mymap);

            mymap.put("phone","999999");
            System.out.println(mymap);

            mymap.replace("phone", "888888");
            System.out.println(mymap);

            mymap.clear();
            System.out.println(mymap);

    }
}
