package com.map;

import java.util.HashMap;
import java.util.Map;

public class Lab1 {
    public static void main(String[] args){
        Map mymap = new HashMap();
        System.out.println(mymap);
        System.out.println(mymap.size());
        System.out.println(mymap.isEmpty());


        mymap.put("sid",101);
        mymap.put("name", "kauhsik");
        mymap.put("sid", 109);
        mymap.put("email", "kaushikprasad1659@gmail.com");
        mymap.put("phone",109);
        mymap.put("email", "kp@gmail.com");
        mymap.put(null, null);


        System.out.println(mymap);
        System.out.println(mymap.size());
        System.out.println(mymap.isEmpty());
    }
}
