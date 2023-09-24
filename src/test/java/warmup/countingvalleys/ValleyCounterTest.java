package warmup.countingvalleys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValleyCounterTest {

    @Test
    void defaultTest(){
        var sut = new ValleyCounter();
        int result = sut.countingValleys(8,"UDDDUDUU");
        assertEquals(1, result);
    }

    @Test
    void shouldReturnTwo(){
        var sut = new ValleyCounter();
        int result = sut.countingValleys(16,"UDDDUDUUUDDDUDUU");
        assertEquals(2, result);
    }

    @Test
    void shouldReturnZero_mountainOnly(){
        var sut = new ValleyCounter();
        int result = sut.countingValleys(12,"UDUUDDUUUDDD");
        assertEquals(0, result);
    }

    @Test
    void shouldReturn3_valleysOnly(){
        var sut = new ValleyCounter();
        int result = sut.countingValleys(10,"DUDDDUUUDU");
        assertEquals(3, result);
    }

    @Test
    void shouldReturn1_valleysOnly(){
        var sut = new ValleyCounter();
        int result = sut.countingValleys(2,"DU");
        assertEquals(1, result);
    }

    @Test
    void shouldReturn0_mountainOnly(){
        var sut = new ValleyCounter();
        int result = sut.countingValleys(2,"UD");
        assertEquals(0, result);
    }

    @Test
    void shouldReturn0_emptySteps(){
        var sut = new ValleyCounter();
        int result = sut.countingValleys(0,"");
        assertEquals(0, result);
    }
}