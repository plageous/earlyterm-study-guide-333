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
    @param stringList a non-empty, non-null ArrayList of Strings
    @return the String with the longest length.
    */

    public static String largestWord(ArrayList<String> stringList) {
        int index = 0;
        for (String string : stringList) { if (string.length() >= stringList.get(index).length()) { index = stringList.indexOf(string); }}
        return stringList.get(index);
    }


}
