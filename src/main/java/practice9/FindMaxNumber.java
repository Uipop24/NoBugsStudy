package practice9;

import java.util.Arrays;

public class FindMaxNumber {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
