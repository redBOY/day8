package main.Program;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("abc", 10);
        map.put("mno", 30);
        map.put("xyz", 20);
        System.out.println("size of map is" + map.size());
        System.out.println(map);
        if (map.containsKey("abc")) {
            Integer a = map.get("abc");
            System.out.println("value of key \"abc\" is" + a);
        }
        map.clear();
    }

    public static void print(HashMap<String, Integer> map) {

        if (map.isEmpty()) {
            System.out.println("map is empty");
        } else {
            System.out.println(map);
        }
    }
}
