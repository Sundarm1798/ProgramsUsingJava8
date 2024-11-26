package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItrMapContainsListOfStringUsingJava8 {
    public static void main(String[] args) {
        Map<String,List<String>> map=new HashMap<>();
        map.put("Fruits", Arrays.asList("Apple","Banana","Watermelon","Orange"));
        map.put("Vegetables",Arrays.asList("Tomoto","Pototo","Carrot","Brinjal"));
        map.put("College",Arrays.asList("TOCS","Anna University","Christ University"));

//        for(Map.Entry<String,List<String>> entry:map.entrySet()){
//            String key=entry.getKey();
//            List<String> values=entry.getValue();
//            System.out.println(key+" :"+values);
//            for(String s:values)
//                System.out.println(" - "+s);
//        }
        map.forEach((key,value)->System.out.println(key+" "+value));
        map.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
        map.forEach((key, list) ->list.replaceAll(item->item+" Eating "));
        map.forEach((Key,value)->System.out.println(Key+" "+value));

    }
}
