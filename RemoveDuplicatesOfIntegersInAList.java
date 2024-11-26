package org.example;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesOfIntegersInAList {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,10,20,30,40,50,60,60,70,70,80);
        List<Integer> sorted=numbers.stream().distinct().toList();
        System.out.println(sorted);
    }
}
