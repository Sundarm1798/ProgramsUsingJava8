package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IterateAndModifyValuesInAMap {
    public static void main(String[] args) {
        Map<String, List<String>> map=new HashMap<>();
        map.put("Fruits", Arrays.asList("Apple","Banana","Watermelon","Orange"));
        //Iterating the values
        for(Map.Entry<String, List<String>> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        //To modify the list of string values usijng java 8
        map.forEach((key,values)->values.replaceAll(items->items+"->eating stuff"));
        //printing the modified values
        map.forEach((key,values)->System.out.println(key+"->"+values));
    }
}
