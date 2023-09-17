package stringmanipulation.makinganagrams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    Anagrams sut;

    @BeforeEach
    void setUp() {
        sut = new Anagrams();
    }


    @Test
    void testEdgeCase_01_NoIntersection(){
        int result = sut.makeAnagram("abc", "defghi");
        assertEquals(9, result);
    }

    @Test
    void testEdgeCase_02_FullOverlap(){
        int result = sut.makeAnagram("defghi", "defghi");
        assertEquals(0, result);
    }

    @Test
    void testCase01_FirstLongerThanSecond(){
        int result = sut.makeAnagram("fghiabc", "cde");
        assertEquals(8, result);
    }

    @Test
    void testCase02_SecondLongerThanFirst(){
        int result = sut.makeAnagram("cde", "fghiabc");
        assertEquals(8, result);
    }

    @Test
    void testCase03_SameLengthWithOverlapping(){
        int result = sut.makeAnagram("abcda", "cdead");
        assertEquals(4, result);
    }
    @Test
    void testCase04_SameLengthWithOverlappingReverse(){
        int result = sut.makeAnagram("cdead", "abcda");
        assertEquals(4, result);
    }

    @Test
    void testCase05_DifferentLengthWithDuplicateChars(){
        int result = sut.makeAnagram("abacd", "cdfgahiacda");
        assertEquals(8, result);
    }

    @Test
    void testAnagram_Ultimate(){
        int result = sut.makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        assertEquals(30, result);
    }
}
