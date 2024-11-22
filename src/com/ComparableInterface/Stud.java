package com.ComparableInterface;

public class Stud implements Comparable<Stud>{
    private String name;
    private  int marks;

    public Stud(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Stud o) {
        return o.getMarks()-this.getMarks();
    }

    @Override
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
