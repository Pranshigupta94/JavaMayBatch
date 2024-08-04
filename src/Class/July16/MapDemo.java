package Class.July16;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Pranshi", 29);
        map.put("Mk", 35);
        map.put("Priya", 28);


        System.out.println(map);

        System.out.println(map.get("Pranshi"));
        System.out.println(map.getOrDefault("MAnik", 30));

        System.out.println(map.keySet());

        

    }
}
