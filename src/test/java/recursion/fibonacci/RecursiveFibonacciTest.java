package recursion.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveFibonacciTest {

    RecursiveFibonacci sut = new RecursiveFibonacci();

    @Test
    void test0(){
        int res = sut.fibonacci(0);
        assertEquals(res, 0);
    }

    @Test
    void test1(){
        int res = sut.fibonacci(1);
        assertEquals(res, 1);
    }

    @Test
    void test2(){
        int res = sut.fibonacci(2);
        assertEquals(res, 1);
    }

    @Test
    void test3(){
        int res = sut.fibonacci(3);
        assertEquals(res, 2);
    }

    @Test
    void test4(){
        int res = sut.fibonacci(4);
        assertEquals(res, 3);
    }

    @Test
    void test5(){
        int res = sut.fibonacci(5);
        assertEquals(res, 5);
    }

    @Test
    void test6(){
        int res = sut.fibonacci(6);
        assertEquals(res, 8);
    }

    @Test
    void test7(){
        int res = sut.fibonacci(7);
        assertEquals(res, 13);
    }

    @Test
    void test23(){
        int res = sut.fibonacci(23);
        assertEquals(res, 28657);
    }


}