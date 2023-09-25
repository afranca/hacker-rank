package sorting.countswaps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    BubbleSort sut;

    @BeforeEach
    void setUp() {
        sut = new BubbleSort();
    }

    @Test
    void countSwaps_case01() {
        List<Integer> list = List.of(6,4,1);
        sut.countSwaps(list);
    }

    @Test
    void countSwaps_case02() {
        List<Integer> list = List.of(1,4);
        sut.countSwaps(list);
    }
    @Test
    void countSwaps_case03() {
        List<Integer> list = List.of(4,1);
        sut.countSwaps(list);
    }

    @Test
    void countSwaps_case04() {
        List<Integer> list = List.of(1);
        sut.countSwaps(list);
    }
    @Test
    void countSwaps_case05() {
        List<Integer> list = new ArrayList<>();
        sut.countSwaps(list);
    }

    @Test
    void countSwaps_case06() {
        List<Integer> list = List.of(0,1,2,4,5,6,7,8,9,10);
        sut.countSwaps(list);
    }

    @Test
    void countSwaps_case07() {
        List<Integer> list = List.of(10,9,8,7,6,5,4,3,2,1,0);
        sut.countSwaps(list);
    }

    @Test
    void countSwaps_case08() {
        List<Integer> list = List.of(-4,3,2,1,0,-5,-6,-7,-8,-9,-10);
        sut.countSwaps(list);
    }

}