package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lab6 {
    public static void main(String []args){

        Map<String,String> mymap = new HashMap<>();

        mymap.put("sid", "101");
        mymap.put("name", "kaushik");
        mymap.put("phone","12345");
        mymap.put("city", "Blore");
        mymap.put("email", "kp@gmail.com");

        System.out.println(mymap);

        System.out.println("---Keys vals---");
        Set<Map.Entry<String,String>> myentries = mymap.entrySet();

        System.out.println(".......................");

        for(Map.Entry<String,String> entry: myentries){
            System.out.println(entry.getKey()+" : "+entry.getValue());

        }
    }
}
