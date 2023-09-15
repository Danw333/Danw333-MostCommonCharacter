import java.util.*;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
       HashMap<Character, Integer> charFrequency = new HashMap<>();
       for (char c: str.toCharArray()){
        charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1); 
       }
       char commonChar = ' ';
       int maxFrequency = 0;

       for (char c: charFrequency.keySet()) {
        int frequency = charFrequency.get(c);
        if (frequency > maxFrequency) {
            commonChar = c;
            maxFrequency = frequency;
        }
       }


       
        return commonChar;
    }
}
