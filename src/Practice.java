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


    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    public static String largestWord(ArrayList<String> stringList) {
        int index = 0;
        for (String string : stringList) { if (string.length() >= stringList.get(index).length()) { index = stringList.indexOf(string); }}
        return stringList.get(index);
    }
}
