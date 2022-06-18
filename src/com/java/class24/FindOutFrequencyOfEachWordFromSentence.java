package com.java.class24;

import java.util.Locale;

public class FindOutFrequencyOfEachWordFromSentence {
    public static void main(String[] args) {
        String str = "The Times of India is an Indian English language daily newspaper and digital news media owned and " +
                "managed by The Times Group. It is the third-largest newspaper in India by circulation and largest " +
                "selling English-language daily in the world.";
        String[] words = str.toLowerCase().split(" ");

        for (String word : words) {
            if (word.contains(str)) {

            }
            System.out.println(str);
        }
    }
}