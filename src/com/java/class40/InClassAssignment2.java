package com.java.class40;

import java.util.HashSet;
import java.util.Set;

public class InClassAssignment2 {
    public static void main(String[] args) {

        String str = "a compulsory contribution to state revenue, levied by the government " +
                "on workers income and business profits or added to the cost " +
                "of some goods services and transactions";

        String [] words = str.split(" ");

            Set <String> setOfWords = new HashSet<String>();

            for (String word : words){
                if (setOfWords.add(word)==false){
                    System.out.println(word);
                }
            }

    }
}
