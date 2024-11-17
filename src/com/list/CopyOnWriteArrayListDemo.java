import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

//        List<String> li=new ArrayList<>();
        List<String> li=new CopyOnWriteArrayList<>();
        li.add("mango");
        li.add("banana");
        li.add("eggs");
        for(String s:li){
            System.out.println(s);
            if(s.equals("eggs")){
                li.add("butter");
                System.out.println("adding element while reading element");
            }
        }
        System.out.println(li);
    }
}
