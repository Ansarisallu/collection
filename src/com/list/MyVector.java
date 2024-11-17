import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        System.out.println(v.capacity());
        for(int i=0; i<10; i++){
            v.add(i);
        }
        v.add(10);
        System.out.println(v.capacity());
    }
}
