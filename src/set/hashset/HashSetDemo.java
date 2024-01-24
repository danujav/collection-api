package set.hashset;

/*
    @author DanujaV
    @created 1/24/24 - 4:11 PM   
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(30);
        System.out.println("arraylist: " + arrayList);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);

        System.out.println("set: " + set);
    }
}
