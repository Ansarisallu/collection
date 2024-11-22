package com.map.WeekMap;

import java.lang.ref.WeakReference;

public class Gc {
    public static void main(String[] args) {
        WeakReference<Student> wr=new WeakReference<>(new Student("sallu","ansari"));
        System.out.println(wr.get());
        System.gc();
        try{
            Thread.sleep(10000);

        }catch (Exception ignored){}
        System.out.println(wr.get());
    }
}

class Student{
   private String fname;
   private String lname;
    public Student(String fname,String lname ){
        this.fname=fname;
        this.lname=lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}