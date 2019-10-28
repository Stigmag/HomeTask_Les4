package com.HomeTask_Les4;

import java.util.HashSet;

public class Task1 {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        char[] test = s.toCharArray();
        HashSet<Character> subString = new HashSet<Character>();
        for (int index = 0; index < test.length; index++) {
            for (int j = 0; j < test.length; j++) {

                if (!subString.contains(test[j])) {
                    subString.add(test[j]);
                    result = Math.max(result, subString.size());

                } else subString.remove(test[j]);
            }


        }
        return result;
    }
}

