package com.map.LinkedHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
//        HashMap<String, Integer> hs=new HashMap<>();
//        hs.put("mango",90);
//        hs.put("apple",69);
//        hs.put("grapes",78);
//
//        for(Map.Entry<String, Integer> i:hs.entrySet()){
//            System.out.println(i.getKey()+":"+i.getValue());
//
//        }
        //LinkedHash map mantaine the insert order of element
        System.out.println("LinkedHash map mantaine the insert order of element");
        LinkedHashMap<String ,Integer> lh=new LinkedHashMap<>(16,0.75f,true);
        lh.put("Mango",90);
        lh.put("Apple",98);
        lh.put("Banana",60);
        //lh.get("Apple");
        lh.putIfAbsent("Grapes",100);
        //System.out.println(lh.getOrDefault("Apple",0));

        for(Map.Entry<String ,Integer> hsd:lh.entrySet()){
            System.out.println(hsd.getKey()+":"+hsd.getValue());
        }


    }
}
