package practice9;

import org.junit.jupiter.api.BeforeEach;

public class LeapYearTestBase {
    protected LeapYear leapYear;

    @BeforeEach
    protected void setUp() {
        leapYear = new LeapYear();
    }

}
