package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountTheOccurrenceOfCharInAString {
    public static void main(String[] args) {
        String s="I'm a java developer";
        s=s.replaceAll("\\s+","");//just removing white spaces
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());

    }
}
