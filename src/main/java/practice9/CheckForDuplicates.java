package practice9;

import java.util.Arrays;

public class CheckForDuplicates {
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }
}
