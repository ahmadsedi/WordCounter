package com.ahmadsedi.word;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 02/02/2025
 * Time: 20:49
 */

public class WordCounterTest {

    @Test
    void countByLiteral(){
        Map<String, Long> map =
                WordCounter.countByLiteral("UK is like no country except UK. One of the best in the world.");
        Assertions.assertEquals(2L, map.get("UK"));
        Assertions.assertEquals(1L, map.get("world"));
    }
    @Test
    void countByLiteral_givenEmptyString(){
        Map<String, Long> map =
                WordCounter.countByLiteral("");
        Assertions.assertTrue(map.isEmpty());
    }
}
