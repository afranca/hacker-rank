package minimumbribes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumBribesTest {

    MinimumBribes sut;

    @Test
    void oneSingleBribe_atTheEnd(){
        List<Integer> testInput = List.of(1,2,4,5,3);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(1,ret);
    }

    @Test
    void oneSingleBribe_atTheBeginning(){
        List<Integer> testInput = List.of(2,1,3,4,5);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(1,ret);
    }

    @Test
    void oneDoubleBribe_atTheEnd(){
        List<Integer> testInput = List.of(1,2,5,3,4);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(2,ret);
    }

    @Test
    void oneDoubleBribe_atTheBeginning(){
        List<Integer> testInput = List.of(3,1,2,4,5);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(2,ret);
    }

    @Test
    void noBribes(){
        List<Integer> testInput = List.of(1,2,3,4,5,6,7,8,9);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(0,ret);
    }

    @Test
    void noBribes_shortList(){
        List<Integer> testInput = List.of(1,2);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(0,ret);
    }

    @Test
    void oneSingleBribe_shortList(){
        List<Integer> testInput = List.of(2,1);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(1,ret);
    }


    @Test
    void twoDoubleBribes_case02(){
        List<Integer> testInput = List.of(3,1,5,2,4);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(3,ret);
    }

    @Test
    void oneSingleBribe_oneDoubleBribe_case01(){
        List<Integer> testInput = List.of(2,4,1,3);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(3,ret);
    }

    @Test
    void oneSingleBribe_oneDoubleBribe_case02(){
        List<Integer> testInput = List.of(1,3,5,2,4,6);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(3,ret);
    }

    @Test
    void twoDoubleBribe_case01(){
        List<Integer> testInput = List.of(3,1,5,2,4,6);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(4,ret);
    }

    @Test
    void twoDoubleBribe_case02(){
        List<Integer> testInput = List.of(1,4,5,2,3);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(4,ret);
    }

    @Test
    void threeDoubleBribe(){
        List<Integer> testInput = List.of(3,1,5,6,2,4);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(6,ret);
    }

    @Test
    void oneDoubleBribe_oneSingleBribe(){
        List<Integer> testInput = List.of(1,4,2,5,3);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(3,ret);
    }
}