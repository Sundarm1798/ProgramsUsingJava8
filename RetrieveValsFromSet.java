package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RetrieveValsFromSet {
    public static void main(String[] args) {
        Set<Integer> set= Stream.of(1,2,3,4,5,6,7).collect(Collectors.toSet());

//        for(Integer n:set){
//            System.out.println(n);
//        }
        set.stream().forEach(System.out::println);

    }
}
