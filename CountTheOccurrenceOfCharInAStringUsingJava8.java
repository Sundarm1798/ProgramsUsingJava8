package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheOccurrenceOfCharInAStringUsingJava8 {
    public static void main(String[] args) {
        String s="helloworld";
        Map<Character,Long> countOfOccursOfChars=s.chars()//convert into intstream
                .mapToObj(c->(char)c)//convert in to int values to stream of character
                .collect(Collectors.groupingBy(Function.identity()//group the chars by themselves
                        ,Collectors.counting()));//count the occurences
        countOfOccursOfChars.forEach(((character, count) ->System.out.println(character+"->"+count) ));
    }
}
