package com.map;

import java.util.HashMap;
import java.util.Map;

public class Lab4 {
    public static void main(String[]args){
        Map<String,String> mymap = new HashMap<>();

            mymap.put("sid", "101");
            mymap.put("name", "kaushik");
//            mymap.put("phone","12345");
            mymap.put("city", "Blore");

            System.out.println(mymap);

            Map<String,String> mymap1 = new HashMap<>();
            mymap1.put("email", "kp@gmail.com");
            mymap1.put("phone", "870925");

            System.out.println(mymap1);
            mymap.putAll(mymap1);


            System.out.println("---------------");

            System.out.println(mymap);
            System.out.println(mymap1);

    }
}
