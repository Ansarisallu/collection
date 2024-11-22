package com.map.Identity;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<String ,Integer> ih=new IdentityHashMap<>();
        String str=new String("img");
        String str1=new String("img");
//        System.out.println(System.identityHashCode(str1));
//        System.out.println(System.identityHashCode(str));
//        System.out.println(str1.hashCode());
//        System.out.println(str.hashCode());
//        ih.put("img",1);
//        ih.put("img",2);

         ih.put(str,1);
         ih.put(str,2);
        System.out.println(ih);
    }
}
