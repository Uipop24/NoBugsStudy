package practice9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapToLengthsTest extends MapToLengthsTestBase {

    @Test
    public void correctMapToMapLength() {
        List<Integer> actual = mapToLengths.mapToLengths(List.of("Java", "C++", "Go"));
        List<Integer> expected = List.of(4, 3, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void EmptyMapToMapLength() {
        List<Integer> actual = mapToLengths.mapToLengths(List.of());
        List<Integer> expected = List.of();
        assertEquals(expected, actual);
    }
}