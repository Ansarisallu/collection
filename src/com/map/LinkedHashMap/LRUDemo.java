package com.map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUDemo<k,v> extends LinkedHashMap<k,v> {
    private int capacity;
    LRUDemo(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUDemo<String, Integer> l=new LRUDemo<>(3);
        l.put("sallu",30);
        l.put("salauddin",90);
        l.put("monu",89);
        l.put("sallu",88);
        l.put("m",00);
        System.out.println(l);

    }
}
