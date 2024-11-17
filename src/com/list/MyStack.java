import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
       // System.out.println(st.search(4));
        int i = st.indexOf(5);
        System.out.println(i);
//        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println(st.capacity());
//        System.out.println(st.remove(2));

        //Linked list implement as Stack
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
//        System.out.println(ll);
//        System.out.println(ll.removeLast());
//        System.out.println(ll.getLast());
//        System.out.println(ll.size());
//        System.out.println(ll.isEmpty());

        //ArrayList use like stack
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        //System.out.println(al.remove(al.size()-1));
        //System.out.println(al.getLast());
        Integer i1 = al.removeLast();
        System.out.println(i1);

    }
}
