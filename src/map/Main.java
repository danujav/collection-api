package map;

/*
    @author DanujaV
    @created 2/1/24 - 9:11 AM   
*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();    // key value paring system/mechanism

//        map.add(10);
        map.put("sl", "Kotte");
        map.put("uk", "London");
        map.put("aus", "Melbourne");
        map.put("usa", "New York");

        System.out.println(map);

    }
}
