package com.problems;

import java.util.HashMap;
import java.util.Map;

public class CommonLetter {
    public static int[] solution(String[] strings) {
        int totalStrings = strings.length;
        int stringLength = strings[0].length();

        for (int position = 0; position < stringLength; position++) {
            // Map character with index of string where it was first seen
            Map<Character, Integer> seenCharacters = new HashMap<>();

            for (int stringIndex = 0; stringIndex < totalStrings; stringIndex++) {
                char currentChar = strings[stringIndex].charAt(position);

                if (seenCharacters.containsKey(currentChar)) {
                    return new int[] {
                            seenCharacters.get(currentChar),
                            stringIndex,
                            position
                    };
                }

                seenCharacters.put(currentChar, stringIndex);
            }
        }

        return new int[0];
    }
}
