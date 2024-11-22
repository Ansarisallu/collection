package com.map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1,"salauddin");
        hm.put(2,"monu");
        hm.put(3,"kallu");
        String sallu = hm.getOrDefault(4, "sallu");
        System.out.println(sallu);
        System.out.println(hm);
        String s = hm.get(1);
        System.out.println(s);
        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("monu"));
        Set<Integer> integers = hm.keySet();
        for (int i:integers){
            System.out.println("values: "+hm.get(i)+" keys: "+i);
        }
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        for(Map.Entry<Integer, String> i:entries){
            System.out.println(i.getKey()+" : "+i.getValue());
        }
        for (Map.Entry<Integer,String> ii:entries){
            ii.setValue(ii.getValue().toUpperCase());
        }
        System.out.println(hm);
        System.out.println(hm.containsValue(2));//O(1) timecomplexity


    }
}