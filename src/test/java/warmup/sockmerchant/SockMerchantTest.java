package warmup.sockmerchant;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SockMerchantTest {

    @Test
    void dafaultInput(){
        var sut = new SockMerchant();
        List<Integer> colorList = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        var result = sut.solve(colorList.size(), colorList);
        assertEquals(result, 3);
    }

    @Test
    void shouldReturnOne(){
        var sut = new SockMerchant();
        List<Integer> colorList = List.of(1,1);
        var result = sut.solve(colorList.size(), colorList);
        assertEquals(result, 1);
    }

    @Test
    void shouldReturnOne_oddInput(){
        var sut = new SockMerchant();
        List<Integer> colorList = List.of(1,1,1);
        var result = sut.solve(colorList.size(), colorList);
        assertEquals(result, 1);
    }

    @Test
    void shouldReturnZero(){
        var sut = new SockMerchant();
        List<Integer> colorList = List.of(1,2);
        var result = sut.solve(colorList.size(), colorList);
        assertEquals(result, 0);
    }

    @Test
    void shouldReturnZero_oddInput(){
        var sut = new SockMerchant();
        List<Integer> colorList = List.of(1,2,3);
        var result = sut.solve(colorList.size(), colorList);
        assertEquals(result, 0);
    }

    @Test
    void shouldReturnThree_perfectMatch(){
        var sut = new SockMerchant();
        List<Integer> colorList = List.of(1,2,3,3,2,1);
        var result = sut.solve(colorList.size(), colorList);
        assertEquals(result, 3);
    }

    @Test
    void shouldReturnZero_emptyList(){
        var sut = new SockMerchant();
        List<Integer> colorList = new ArrayList<>();
        var result = sut.solve(colorList.size(), colorList);
        assertEquals(result, 0);
    }
}