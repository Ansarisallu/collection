package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student>{
    private int id;
    private String name;
    private int age;

    public Student(){

    }
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()-o2.getAge()>0){
            return -1;
        } else if (o1.getAge()-o2.getAge()<0) {
            return 1;

        }else {
            return  (o1.getName().compareTo(o2.getName()));
        }
    }
}

class MyComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.compareTo(o2)==0){
            return 0;
        } else if (o1.compareTo(o2)==1) {
            return -1;
        }else {
            return 1;
        }
    }
}

public class MyArrayList {
    public static void main(String[] args) {
//        List<Student> li=new ArrayList<>();
//        li.add(new Student(1,"salauddin",22));
//        li.add(new Student(2,"monu",23));
//        li.add(new Student(3,"sudhir",21));
//        li.add(new Student(3,"mallu",22));
////        li.sort(Comparator.comparing(Student::getAge).reversed());
//        li.sort(new Student());
//        for(Student st:li){
//            System.out.print(st.getName()+" ");
//            System.out.print(st.getAge()+" ");
//            System.out.print(st.getId()+" ");
//            System.out.println();
//        }
        List<String> lli=new ArrayList<>();
        lli.add("sallu");
        lli.add("monu");
        lli.add("kallu");
        lli.add(1,"index1");
        System.out.println(lli);
        lli.addFirst("first");
        lli.addLast("last");
        System.out.println(lli);
        lli.addAll(2, Arrays.asList("index2","value1"));
        System.out.println(lli);

//        List<String> li=new ArrayList<>();
//        li.add("Sachin");
//        li.add("Ratan");
//        li.add("Sachin");
//        //li.sort(new MyComparator());
//
//        System.out.println(li);
//
//
//        System.out.println(li);
    }
}
