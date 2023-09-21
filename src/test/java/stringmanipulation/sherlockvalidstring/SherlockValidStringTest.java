package stringmanipulation.sherlockvalidstring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockValidStringTest {

    final String NO = "NO";
    final String YES = "YES";

    SherlockValidString sut;
    @BeforeEach
    void setUp() {
        sut = new SherlockValidString();
    }

    @Test
    void isValid_FailedCase04() {
        String s = "aabbc";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }

    @Test
    void isValid_FailedCase05() {
        String s = "aaaaabc";
        String result = sut.isValid(s);
        assertEquals(NO, result);
    }

    @Test
    void isValid_FailedCase17() {
        String s = "aabbccddeefghi";
        String result = sut.isValid(s);
        assertEquals(NO, result);
    }

    @Test
    void isValid_FailedCase18() {
        String s = "abcdefghhgfedecba";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }

    @Test
    void isValid_FailedCase16() {
        String s = "abbac";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }



    @Test
    void isValid_testCase01() {
        String s = "abb";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }

    @Test
    void isValid_testCase02() {
        String s = "aab";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }

    @Test
    void isValid_testCase03() {
        String s = "aaabbbcccefg";
        String result = sut.isValid(s);
        assertEquals(NO, result);
    }

    @Test
    void isValid_testCase04() {
        String s = "aaabbbfg";
        String result = sut.isValid(s);
        assertEquals(NO, result);
    }

    @Test
    void isValid_testCase05() {
        String s = "aaabbb";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }

    @Test
    void isValid_testCase06() {
        String s = "aabb";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }

    @Test
    void isValid_testCase07() {
        String s = "ab";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }

    @Test
    void isValid_testCase08() {
        String s = "aa";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }

    @Test
    void isValid_testCase09() {
        String s = "a";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }

    @Test
    void isValid_testCase10() {
        String s = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";
        String result = sut.isValid(s);
        assertEquals(YES, result);
    }

}