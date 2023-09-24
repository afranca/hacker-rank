package warmup.jumpingonclouds;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnCloudsTest {

    @Test
    void test1(){
        var sut = new JumpingOnClouds();
        var cloudsList = List.of(0,0,1,0,0,1,0);
        var result = sut.jumpingOnClouds(cloudsList);
        assertEquals(4, result);
    }

    @Test
    void test2(){
        var sut = new JumpingOnClouds();
        var cloudsList = List.of(0,0,0);
        var result = sut.jumpingOnClouds(cloudsList);
        assertEquals(1, result);
    }

    @Test
    void test3(){
        var sut = new JumpingOnClouds();
        var cloudsList = List.of(0,0);
        var result = sut.jumpingOnClouds(cloudsList);
        assertEquals(1, result);
    }

    @Test
    void test4(){
        var sut = new JumpingOnClouds();
        var cloudsList = List.of(0,0,0,0);
        var result = sut.jumpingOnClouds(cloudsList);
        assertEquals(2, result);
    }

    @Test
    void test5(){
        var sut = new JumpingOnClouds();
        var cloudsList = List.of(0,0,0,0,0);
        var result = sut.jumpingOnClouds(cloudsList);
        assertEquals(2, result);
    }
}