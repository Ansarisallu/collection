package com.map.HashMap;

import java.util.HashMap;
import java.util.Objects;

public class HashMapWithEqualsMethod {
    public static void main(String[] args) {
        HashMap<Student, Integer> hs=new HashMap<>();
        Student s1=new Student("salauddin",1);
        Student s2=new Student("monu",2);
        Student s3=new Student("salauddin",1);
        hs.put(s1,90);
        hs.put(s2,99);
        hs.put(s3,100);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.get(s1));
        System.out.println(hs.get(s3));



//        HashMap<String, Integer> hs=new HashMap<>();
//        hs.put("salauddin",100);
//        hs.put("Sallu",90);
//        hs.put("salauddin",101);
//        System.out.println(hs);

    }
}

class Student {
    private String name;
    private  int id;

    public Student(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if (obj==null){
            return  false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        Student st=(Student) obj;
        return id==st.getId() && Objects.equals(name,st.getName());

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}