package list.arraylist;

/*
    @author DanujaV
    @created 1/24/24 - 3:34 PM   
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Danuja");
        list.add(10);
        list.add(10.5);
        list.add(true);
        list.add('A');

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        /*list2.add("Danuja");
        list2.add(10.5);*/

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Danuja");
        nameList.add("Dinusha");
        nameList.add("Dinu");
//        nameList.add(10);

        System.out.println(nameList);

        boolean isDeleted = nameList.remove("Dinu");
        System.out.println("after: " + nameList);

        String removed = nameList.remove(0);
        System.out.println(removed);

        List<Double> list3 = new ArrayList<>();
    }
}
