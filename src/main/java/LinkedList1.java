import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Akshay");
        list.add("prakash");
        list.add(1,"Kajal");


        System.out.println("elements of list"+list);

        Iterator iterator1 =list.descendingIterator();

        //Iterator<String> iterator=list.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
