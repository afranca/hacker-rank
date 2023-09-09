package pairs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PairsTest {

    Pairs sut = new Pairs();

    @Test
    void simpleCase(){
        List arr = List.of(1,5,3,4,2);
        int k = 2;
        int actual = sut.pairs(k,arr);
        assertEquals(3, actual);
    }

    @Test
    void minArray_with1Match(){
        List arr = List.of(3,5);
        int k = 2;
        int actual = sut.pairs(k,arr);
        assertEquals(1, actual);
    }

    @Test
    void minArray_withNoMatch(){
        List arr = List.of(1,5);
        int k = 2;
        int actual = sut.pairs(k,arr);
        assertEquals(0, actual);
    }

}