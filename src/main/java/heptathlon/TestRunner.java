package heptathlon;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestRunner {
    @Test
    public void testHep100MHurdlesValidTime() {
        Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
        int expected = 1041;
        double testData = 13.56;
        int actual = hep100MHurdles.calculateResult(testData);
        assertEquals(expected, actual);
    }
    @Test
    public void testHep200MValidTime() {
        Hep200M hep200M = new Hep200M();
        int expected = 937;
        double testData = 24.46;
        int actual = hep200M.calculateResult(testData);
        assertEquals(expected, actual);
    }
    @Test
    public void testHep800MValidTime() {
        Hep800M hep800M = new Hep800M();
        int expected = 956;
        double testData = 130.62;
        int actual = hep800M.calculateResult(testData);
        assertEquals(expected, actual);
    }
    @Test
    public void  testHeptHightJumpValidHight() {
        HeptHightJump heptHightJump = new HeptHightJump() ;
        int expected = 1132;
        double testData = 192;
        int actual = heptHightJump.calculateResult(testData);
        assertEquals(expected, actual);
    }
    @Test
    public void  testHeptJavelinThrowValidLenght() {
        HeptJavelinThrow heptJavelinThrow = new HeptJavelinThrow() ;
        int expected = 939;
        double testData = 54.04;
        int actual = heptJavelinThrow.calculateResult(testData);
        assertEquals(expected, actual);
    }
    @Test
    public void  testHeptLongJumpValidLenght() {
        HeptLongJump heptLongJump = new HeptLongJump() ;
        int expected = 978;
        double testData = 641;
        int actual = heptLongJump.calculateResult(testData);
        assertEquals(expected, actual);
    }
    @Test
    public void  testHeptShotPutValidLenght() {
        HeptShotPut heptShotPut = new HeptShotPut() ;
        int expected = 897;
        double testData = 15.54;
        int actual = heptShotPut.calculateResult(testData);
        assertEquals(expected, actual);
    }
}
