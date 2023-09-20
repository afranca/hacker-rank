package stringmanipulation.sherlockvalidstring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockValidStringTest {

    final String NO = "NO";
    final String YES = "YES";

    SherlockValidString sut;
    @BeforeEach
    void setUp() {
        sut = new SherlockValidString();
    }

    @Test
    void isValid() {
        String s = "aabbccddeefghi";
        String result = sut.isValid(s);
        assertEquals(NO, result);
    }
}