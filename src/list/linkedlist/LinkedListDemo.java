package list.linkedlist;

/*
    @author DanujaV
    @created 1/24/24 - 3:47 PM   
*/

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Danuja");
        list.add(10);
        list.add(10.5);
        list.add(true);

        System.out.println(list);

        boolean isDeleted = list.remove("Danuja");
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
//        list2.add("Danuja");
    }
}
