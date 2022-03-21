package ss12.ThucHanh.List_Students_By_Age;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hoang", 21);
        hashMap.put("Linh", 19);
        hashMap.put("Anh", 22);
        hashMap.put("Nhung", 23);
        hashMap.put("Son", 18);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Hoang", 21);
        linkedHashMap.put("Linh", 19);
        linkedHashMap.put("Nam", 22);
        linkedHashMap.put("Nhung", 23);
        linkedHashMap.put("Son", 18);
        System.out.println("\nThe age for " + "Linh is " + linkedHashMap.get("Linh"));
    }
}
