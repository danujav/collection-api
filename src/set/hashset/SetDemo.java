package set.hashset;

/*
    @author DanujaV
    @created 1/24/24 - 4:20 PM   
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(54);
        hashSet.add(44);
        hashSet.add(14);
        hashSet.add(94);
        hashSet.add(10);
        System.out.println("hashSet: " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(54);
        linkedHashSet.add(44);
        linkedHashSet.add(14);
        linkedHashSet.add(94);
        linkedHashSet.add(10);
        System.out.println("linkedHashSet: " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(54);
        treeSet.add(44);
        treeSet.add(14);
        treeSet.add(94);
        treeSet.add(10);
        System.out.println("treeSet: " + treeSet);
    }
}
