package com.map;
import java.util.Hashtable;
import java.util.Set;

public class Lab9 {
    public static void main(String[]args){
        Hashtable<String,String> mymap = new Hashtable<>();
        mymap.put("sid", "101");
        mymap.put("name", "kaushik");
        mymap.put("phone","12345");
        mymap.put("city", "Blore");
        mymap.put("email", "kp@gmail.com");

        //mymap.put("myjlc", null);
        //mymap.put(null,"myjlc");


        System.out.println(mymap);
        System.out.println("---All keys----");
        Set<String> mykey = mymap.keySet();
        for(String mykeys:mykey){
            System.out.println(mykeys);
        }



    }
}
