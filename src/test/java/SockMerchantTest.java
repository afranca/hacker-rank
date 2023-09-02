import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SockMerchantTest {

    @Test
    void dafaultInput(){
        var sut = new SockMerchant();
        List<Integer> colorList = List.of(1,2,1,2,1,3,2);
        var result = sut.solve(colorList.size(), colorList);
        assertEquals(result, 2);
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
}