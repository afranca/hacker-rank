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
    void test3(){
        List<Integer> arr = List.of(1, 2, 3 , 4, 5);
        var result = sut.rotLeft(arr, arr.size());
        assertEquals(arr, result);
    }

    @Test
    void shoulsAlwaysGetOriginalArrayIfRotationNumberIsArrraySize(){
        List<Integer> arr = List.of(4,2,3,4,5,9,7);
        var result = sut.rotLeft(arr, arr.size());
        assertEquals(arr, result);
    }

}