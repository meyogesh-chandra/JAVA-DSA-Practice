package Hashmap;

import java.util.HashMap;

public class MapsStl {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Raghav",25);
        map.put("Aditya",19);
        map.put("vivek",17);
        map.put("deepika",25);
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Raghav"));
        System.out.println(map.containsKey("deepika"));

        //traversal
        for(String key: map.keySet()){
            System.out.println(key+" "+map.get(key));

        }

    }
}
