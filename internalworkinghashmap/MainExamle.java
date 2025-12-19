package internalworkinghashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MainExamle {
    public static void main(String[] args) {
        HashMap<String, Integer> friends = new HashMap<>();
        friends.put("Ankit", 20);
        friends.put("Uttam", 25);
        friends.put(null, 30);

        System.out.println(friends);

        Iterator<Map.Entry<String, Integer>> iterator = friends.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> currentEntry = iterator.next();
            if(currentEntry.getKey() == null){
                System.out.println("Key is null and value is: " + currentEntry.getValue());
                iterator.remove();
            }
        }

        System.out.println(friends);

    }

}
