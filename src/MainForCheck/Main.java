package MainForCheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        HashMap<Integer, String> www = new HashMap<>();

       www.put(21221133, "Аркадьевна Бубликова");
       www.put(213, " Бубликова");


        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        passportsAndNames.putAll(www);


        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Значения: " + values);
    }
}
