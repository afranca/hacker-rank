package stringmanipulation.alternatingcharacters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingCharactersTest {

    AlternatingCharacters sut;
    @BeforeEach
    void setUp() {
        sut = new AlternatingCharacters();
    }

    @Test
    void testCase01_EdgeCase(){
        int result = sut.alternatingCharacters("A");
        assertEquals(0,result);

        result = sut.alternatingCharacters("B");
        assertEquals(0,result);
    }
    @Test
    void testCase02_EdgeCase(){
        int result = sut.alternatingCharacters("AAAAAA");
        assertEquals(5,result);

        result = sut.alternatingCharacters("BBBBBB");
        assertEquals(5,result);
    }
    @Test
    void testCase03_EdgeCase(){
        int result = sut.alternatingCharacters("AAAAAAB");
        assertEquals(5,result);

        result = sut.alternatingCharacters("BBBBBBA");
        assertEquals(5,result);
    }
    @Test
    void testCase04_EdgeCase(){
        int result = sut.alternatingCharacters("BAAAAAA");
        assertEquals(5,result);

        result = sut.alternatingCharacters("ABBBBBB");
        assertEquals(5,result);
    }
    @Test
    void testCase05_EdgeCase(){
        int result = sut.alternatingCharacters("AAABAAA");
        assertEquals(4,result);

        result = sut.alternatingCharacters("BBBABBB");
        assertEquals(4,result);
    }

    @Test
    void testCase06_EdgeCase(){
        int result = sut.alternatingCharacters("AB");
        assertEquals(0,result);

        result = sut.alternatingCharacters("BA");
        assertEquals(0,result);
    }

    @Test
    void testCase07_RandomLongString(){
        int result = sut.alternatingCharacters("AAABABBB");
        assertEquals(4,result);
    }
}