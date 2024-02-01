package map;

/*
    @author DanujaV
    @created 2/1/24 - 9:19 AM   
*/

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Map<String, Double> marksMap = new HashMap<>();

//        marksMap.put(1, "343");
        marksMap.put("supun", 75.8);
        marksMap.put("kasun", 86.8);
        marksMap.put("nimal", 99.5);
        marksMap.put("sithum", 12.8);
        System.out.println("HashMap: " + marksMap);

        Map<String, Double> marksMap2 = new LinkedHashMap<>();

        marksMap2.put("supun", 75.8);
        marksMap2.put("kasun", 86.8);
        marksMap2.put("nimal", 99.5);
        marksMap2.put("sithum", 12.8);
        System.out.println("LinkedHashMap: " + marksMap2);

        Map<String, Double> marksMap3 = new TreeMap<>();

        marksMap3.put("supun", 75.8);
        marksMap3.put("kasun", 86.8);
        marksMap3.put("nimal", 99.5);
        marksMap3.put("sithum", 12.8);
        System.out.println("Treemap: " + marksMap3);

        Map<String, Double> marksMap4 = new Hashtable<>();

        marksMap4.put("supun", 75.8);
        marksMap4.put("kasun", 86.8);
        marksMap4.put("nimal", 99.5);
        marksMap4.put("sithum", 12.8);
        System.out.println("HashTable: " + marksMap4);
    }
}
