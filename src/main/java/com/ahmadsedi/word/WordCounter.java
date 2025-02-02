package com.ahmadsedi.word;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 02/02/2025
 * Time: 20:34
 */

public class WordCounter {
    public static Map<String, Long> countByLiteral(String sentence){
        return Arrays.stream(sentence.split("\\s+")).
                map(s->s.replace(".", "")).
                filter(s->!s.isEmpty()).
                collect(Collectors.groupingBy(String::toString, Collectors.counting()));
    }
}
