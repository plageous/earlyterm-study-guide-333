import java.util.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testSingleNumber() {
        // Arr
        int[] number = {1};
        // Act
        int actual = Practice.maxDiff(number);
        // Assert
        // should be 0
        assertEquals(0, actual);
    }

    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    // TODO: Make tests for each problem you solve
    @Test
    void testLargest() {
        // Arrange
        ArrayList<String> strings = new ArrayList<>();
        strings.add("work");
        strings.add("abacus");
        strings.add("proximity");
        strings.add("juice");
        strings.add("cat");
        // Act
        String actual = Practice.largestWord(strings);
        // Assert
        assertEquals(strings.get(2).length(), actual.length());
    }
}


