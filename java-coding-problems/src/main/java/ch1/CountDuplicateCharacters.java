package ch1;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {

    public static void countDuplicates(String stringToCount) {
        Map<Character, Integer> result = new HashMap<>();

        for(int i = 0; i < stringToCount.length(); i++) {
            char ch = stringToCount.charAt(i);

            if (result.containsKey(ch)) {
                result.put(ch, result.get(ch) + 1);
            } else {
                result.put(ch, 1);
            }
        }
        System.out.println(result);
    }
}


