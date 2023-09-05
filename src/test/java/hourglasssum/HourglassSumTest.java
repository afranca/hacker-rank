package hourglasssum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HourglassSumTest {

    HourglassSum sut;

    @BeforeEach
    void setUp(){
        sut = new HourglassSum();
    }

    @Test
    void test1(){
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(List.of( 1, 1, 1, 0, 0, 0));
        rows.add(List.of( 0, 1, 0, 0, 0, 0));
        rows.add(List.of( 1, 1, 1, 0, 0, 0));
        rows.add(List.of( 0, 0, 2, 4, 4, 0));
        rows.add(List.of( 0, 0, 0, 2, 0, 0));
        rows.add(List.of( 0, 0, 1, 2, 4, 0));

        int result = sut.hourglassSum(rows);

        assertEquals(19, result);
    }

    @Test
    void test2(){
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(List.of(-9,-9,-9, 1, 1, 1));
        rows.add(List.of( 0,-9, 0, 4, 3, 2));
        rows.add(List.of(-9,-9,-9, 1, 2, 3));
        rows.add(List.of( 0, 0, 8, 6, 6, 0));
        rows.add(List.of( 0,0 , 0,-2, 0, 0));
        rows.add(List.of( 0, 0, 1, 2, 4, 0));

        int result = sut.hourglassSum(rows);

        assertEquals(28, result);
    }

    @Test
    void test3(){
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(List.of( 1, 1, 1, 0, 0, 0));
        rows.add(List.of( 0, 1, 0, 0, 0, 0));
        rows.add(List.of( 1, 1, 1, 0, 0, 0));
        rows.add(List.of( 0, 0, 0, 2, 4, 4));
        rows.add(List.of( 0, 0, 0, 0, 3, 0));
        rows.add(List.of( 0, 0, 0, 1, 2, 4));

        int result = sut.hourglassSum(rows);

        assertEquals(20, result);
    }

    @Test
    void test4(){
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(List.of( 0, 0, 0, 1, 1, 1));
        rows.add(List.of( 0, 0, 0, 0, 3, 0));
        rows.add(List.of( 0, 0, 0, 1, 2, 4));
        rows.add(List.of( 1, 1, 1, 0, 0, 0));
        rows.add(List.of( 0, 1, 0, 0, 0, 0));
        rows.add(List.of( 1, 1, 1, 0, 0, 0));

        int result = sut.hourglassSum(rows);

        assertEquals(13, result);
    }

    @Test
    void test5(){
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(List.of( 0, 0, 0, 1, 1, 1));
        rows.add(List.of( 0, 0, 0, 0, 3, 0));
        rows.add(List.of( 0, 5, 5, 1, 2, 4));
        rows.add(List.of( 1, 1, 1, 0, 0, 0));
        rows.add(List.of( 0, 1, 1, 1, 0, 0));
        rows.add(List.of( 1, 1, 1, 0, 0, 0));

        int result = sut.hourglassSum(rows);

        assertEquals(15, result);
    }

}