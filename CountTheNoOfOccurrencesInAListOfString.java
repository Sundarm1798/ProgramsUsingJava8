package org.example;

import java.util.Arrays;
import java.util.List;

public class CountTheNoOfOccurrencesInAListOfString {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","apPle","orange","banana","strawberry","pomegrenate");
        String wordToCount="apple";
        long n= words.stream().filter(word->word.equalsIgnoreCase(wordToCount)).count();
        System.out.println("The word "+wordToCount+" occurs "+n+" times");
    }
}
