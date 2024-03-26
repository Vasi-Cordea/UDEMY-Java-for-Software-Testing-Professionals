package OOP.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {

        ArrayList<Integer> alist = new ArrayList<Integer>();  // Array list declaration

        HashMap<String, String> hmap = new HashMap<String, String>();  // HashMap declaration

        hmap.put("US57", "Olivia"); //added first pair to hashmap
        hmap.put("US59", "Ruby");
        hmap.put("US89", "Emily");
        hmap.put("US1", "Grace");
        hmap.put("US45", "Jessica");
        hmap.put("US5", "Ruby");

        //  System.out.println(hmap);
        // System.out.println(hmap.get("US5"));

        // hmap.forEach((key,value)->System.out.println(key + "-" +  value));

        hmap.forEach((key, value) -> System.out.println(key + ":-" + value));
    }
}