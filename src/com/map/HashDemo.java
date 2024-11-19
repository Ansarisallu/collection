package com.map;

public class HashDemo {
    public static void main(String[] args) {
        System.out.println(hashing1("abc"));
        System.out.println(hashing1("cba"));
    }
    public  static  int hashing1(String str){
        int sum=0;
        for(char ch:str.toCharArray()){
            int nu=(int) ch;
            sum+=nu;
        }
        return sum%10;
    }
}
