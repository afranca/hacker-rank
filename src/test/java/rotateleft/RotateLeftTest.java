package rotateleft;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RotateLeftTest {

    RotateLeft sut;

    @BeforeEach
    void setUp(){
        sut = new RotateLeft();
    }


    @Test
    void testDLesserThanSize(){
        List<Integer> arr = List.of(5,7,2,3);
        var result = sut.rotLeft(arr, 1);
        assertEquals(List.of(7,2,3,5), result);
    }


    @Test
    void testDEqualsToSize(){
        List<Integer> arr = List.of(5,7,2,3);
        var result = sut.rotLeft(arr, 4);
        assertEquals(List.of(5,7,2,3), result);
    }

    @Test
    void testDMultipleOfSize(){
        List<Integer> arr = List.of(5,7,2,3);
        var result = sut.rotLeft(arr, 12);
        assertEquals(List.of(5,7,2,3), result);
    }

    @Test
    void testDGreaterThanSize(){
        List<Integer> arr = List.of(5,7,2,3);
        var result = sut.rotLeft(arr, 14);
        assertEquals(List.of(2,3,5,7), result);
    }



    @Test
    void test1(){
        List<Integer> arr = List.of(1, 2, 3 , 4, 5);
        var result = sut.rotLeft(arr, 1);

        assertEquals(List.of(2,3,4,5,1), result);
    }

    @Test
    void test2(){
        List<Integer> arr = List.of(1, 2, 3 , 4, 5);
        var result = sut.rotLeft(arr, 3);

        assertEquals(List.of(4,5,1,2,3), result);
    }


    @Test
    void shoulsAlwaysGetOriginalArrayIfRotationNumberIsArrraySize(){
        List<Integer> arr = List.of(4,2,3,4,5,9,7);
        var result = sut.rotLeft(arr, arr.size());
        assertEquals(arr, result);
    }



}