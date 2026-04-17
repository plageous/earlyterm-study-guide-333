import java.util.*;

public class Practice {

    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */

    public static int maxDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (num > max) { max = num; }
            if (num < min) { min = num; } 
        }
        return max - min;
    }

    /**
    Returns the largest string in an ArrayList of Strings.
    @param stringList a non-empty, non-null ArrayList of Strings.
    @return the String with the longest length.
    */

    public static String largestWord(ArrayList<String> stringList) {
        int index = 0;
        for (String string : stringList) { if (string.length() >= stringList.get(index).length()) { index = stringList.indexOf(string); }}
        return stringList.get(index);
    }

    /**
     * 
     * @param stringSet a non-empty, non-null Set of Strings.
     * @param m an int representing a maximum.
     * @param n an int representing a minimum.
     * @return the amount of words with length between m and n represented by an integer.
     */
    public static int mnWords(Set<String> stringSet, int m, int n) {
        int validWords = 0;
        for (String word : stringSet) { if (word.length() > n && word.length() < m) { validWords++; }}
        return validWords;
    }
}
