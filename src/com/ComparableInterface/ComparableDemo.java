package com.ComparableInterface;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Stud> li=new ArrayList<>();
        li.add(new Stud("kallu",21));
        li.add(new Stud("sallu",90));
        li.add(new Stud("monu",89));
        li.add(new Stud("kallu",20));
        li.sort(null);
        System.out.println(li);
    }
}
