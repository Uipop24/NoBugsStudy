package practice9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortByLengthTest extends SortByLengthTestBase {

    @Test
    public void simpleSort() {
        List<String> actual = sortByLength.sortByLength(List.of("Java", "C", "Python"));
        List<String> expected = List.of("C", "Java", "Python");
        assertEquals(expected, actual);
    }

    @Test
    public void sameLengthElements() {
        List<String> actual = sortByLength.sortByLength(List.of("aa", "bb", "cc"));
        List<String> expected = List.of("aa", "bb", "cc");
        assertEquals(expected, actual);
    }

    @Test
    public void emptyList() {
        List<String> actual = sortByLength.sortByLength(List.of());
        List<String> expected = List.of();
        assertEquals(expected, actual);
    }

}
