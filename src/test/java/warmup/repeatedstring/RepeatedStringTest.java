package warmup.repeatedstring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedStringTest {

    RepeatedString sut;

    @BeforeEach
    void setUp(){
        sut = new RepeatedString();
    }

    @Test
    void testDefaultCase(){
        long result =  sut.repeatedString("abcac", 10);
        assertEquals(4, result);
    }

    @Test
    void testShortStringRepeated10X(){
        long result =  sut.repeatedString("a", 10);
        assertEquals(10, result);
    }

    @Test
    void testShortStringRepeated5X(){
        long result =  sut.repeatedString("aa", 10);
        assertEquals(10, result);
    }

    @Test
    void testShortStringNotRepeated(){
        long result =  sut.repeatedString("a", 1);
        assertEquals(1, result);
    }

    @Test
    void testNoOccurrencesInString(){
        long result =  sut.repeatedString("bc", 5);
        assertEquals(0, result);
    }

    @Test
    void testOneBillionCharacterLengthString(){
        long result =  sut.repeatedString("ab", 1000000);
        assertEquals(500000, result);
    }
}