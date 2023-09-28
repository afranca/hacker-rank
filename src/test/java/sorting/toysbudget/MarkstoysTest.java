package sorting.toysbudget;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarkstoysTest {

    Markstoys sut;

    @BeforeEach
    void setUp() {
        sut = new Markstoys();
    }

    @Test
    void testCase_emptyList() {
        int k = 7;
        List<Integer> prices = new ArrayList<>();

        int res = sut.maximumToys(prices, k);
        assertEquals(res, 0);
    }

    @Test
    void testCase_ZeroBudget() {
        int k = 0;
        List<Integer> prices = List.of(1,12,5,111,200,1000,10);

        int res = sut.maximumToys(prices, k);
        assertEquals(res, 0);
    }

    @Test
    void testCase_BudgetNotEnough() {
        int k = 4;
        List<Integer> prices = List.of(7,12,5,111,200,1000,10);

        int res = sut.maximumToys(prices, k);
        assertEquals(res, 0);
    }

    @Test
    void testCase_BudgetEnoughForOne_first() {
        int k = 5;
        List<Integer> prices = List.of(4,112,55,111,200,1000,10);

        int res = sut.maximumToys(prices, k);
        assertEquals(res, 1);
    }

    @Test
    void testCase_BudgetEnoughForOne_middle() {
        int k = 5;
        List<Integer> prices = List.of(47,112,4,111,200,1000,10);

        int res = sut.maximumToys(prices, k);
        assertEquals(res, 1);
    }

    @Test
    void testCase_BudgetEnoughForOne_last() {
        int k = 5;
        List<Integer> prices = List.of(47,112,50,111,200,1000,4);

        int res = sut.maximumToys(prices, k);
        assertEquals(res, 1);
    }

    @Test
    void defaultTest() {

        List<Integer> prices = List.of(1,12,5,111,200,1000,10);

        int res = sut.maximumToys(prices, 50);
        assertEquals(res, 4);
    }

    @Test
    void testCase01() {
        int k = 7;
        List<Integer> prices = List.of(1,2,3,4);

        int res = sut.maximumToys(prices, k);
        assertEquals(res, 3);
    }

    @Test
    void testCase02() {
        int k = 7;
        List<Integer> prices = List.of(1,2,3,4,5,6);

        int res = sut.maximumToys(prices, k);
        assertEquals(res, 3);
    }

}