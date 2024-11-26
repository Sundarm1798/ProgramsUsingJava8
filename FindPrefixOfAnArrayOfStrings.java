package org.example;

import java.util.Arrays;
import java.util.List;

public class FindPrefixOfAnArrayOfStrings {
    public static void main(String[] args) {
        String[] words={"apple","orange","avacado","applet","application"};
        String prefix="ap";
        List<String> sortedWords= Arrays.stream(words).filter(s->s.startsWith(prefix)).toList();
        System.out.println(sortedWords);
    }
}
