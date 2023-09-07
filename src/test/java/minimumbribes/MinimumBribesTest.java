package minimumbribes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumBribesTest {

    MinimumBribes sut;

    @Test
    void defaultTest(){
        List<Integer> testInput = List.of(1,2,4,5,3);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(2,ret);
    }

    @Test
    void shouldReturn1(){
        List<Integer> testInput = List.of(1,2,4,3,5);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(1,ret);
    }

    @Test
    void shouldReturn0(){
        List<Integer> testInput = List.of(1,2,3,4,5,6,7,8,9);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(0,ret);
    }

    @Test
    void shouldReturn0_shortList(){
        List<Integer> testInput = List.of(1,2);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(0,ret);
    }

    @Test
    void shouldReturn1_shortList(){
        List<Integer> testInput = List.of(2,1);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(1,ret);
    }

    @Test
    void shouldReturn3(){
        List<Integer> testInput = List.of(1,4,2,5,3);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(3,ret);
    }

    @Test
    void shouldReturn4(){
        List<Integer> testInput = List.of(1,4,5,2,3);
        sut = new MinimumBribes();
        int ret = sut.minimumBribes(testInput);
        assertEquals(4,ret);
    }
}