package com.map.WeekMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> images=new WeakHashMap<>();
        loadcache(images);
        System.out.println("before simulate function:"+images);
        System.gc();
        simulate();
        System.out.println("after simulate function:"+images);

    }
  public static void simulate(){
      System.out.println("function is processing...");
      try {
          Thread.sleep(10000);
      } catch (InterruptedException e) {
          System.out.println(e);
      }
  }
  public  static void loadcache(Map<String, Image> image){
        String str=new String("img");
        String str1=new String("img1");
        image.put(str,new Image("image"));
        image.put(str1,new Image("image1"));

  }
}
class Image{
    String image;

    public Image(String image){
        this.image=image;
    }

    @Override
    public String toString() {
        return "Image{" +
                "image='" + image + '\'' +
                '}';
    }
}