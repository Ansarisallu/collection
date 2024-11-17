import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>(Arrays.asList("cat","lion","monkey","fox"));
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("cat","fox"));
        ll.removeAll(ll1);
        System.out.println(ll);

//        LinkedList<Integer> ll=new LinkedList<>();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//        ll.add(4);
//        ll.add(5);
//        ll.addFirst(-1);
//        ll.addLast(8);
//        System.out.println(ll);
//        System.out.println("get First"+ll.getFirst());//o(1)
//        System.out.println("getLast:"+ll.getLast());
//        ll.set(2,222);
//        System.out.println(ll);
//        System.out.println("get at index element:"+ll.get(2));//O(n);
//        System.out.println();
//        ll.removeIf(x->x%2==0);
//        System.out.println(ll);

    }
}
