package decathlon;

import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;

public class TestRunner {

    @Test
    public void testDeca100validTime() {
        Deca100M deca100M = new Deca100M();
        int expected = 926;
        double testData = 10.71;
        int actual = deca100M.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeca110MHurdlesValidTime() {
        Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
        int expected = 942;
        double testData = 14.25;
        int actual = deca110MHurdles.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeca400MValidRunningTime() {
        Deca400M deca400M = new Deca400M();
        int expected = 924;
        double testData = 47.69;
        int actual = deca400M.calculateResult(testData);
        assertEquals(expected, actual);
    }

     @Test
      public void  testDeca1500MValidRunningTime() {
          Deca1500M deca1500M = new Deca1500M();
          int expected = 687;
          double testData = 279;
          int actual = deca1500M.calculateResult(testData);
          assertEquals(expected, actual);
      }
    @Test
    public void testDecaDiscusThrowValidLength() {
        DecaDiscusThrow decaDiscusThrow = new DecaDiscusThrow();
        int expected = 866;
        double testData = 49.80;
        int actual = decaDiscusThrow.calculateResult(testData);
        assertEquals(expected, actual);
    }
    @Test public void  testDecaHighJumpValidHight() {
        DecaHighJump decahighjump = new DecaHighJump() ;
        int expected = 794;
        double testData = 199;
        int actual = decahighjump.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test public void  testDecaJavelinThrowValidLength() {
        DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow() ;
        int expected = 842;
        double testData = 66.87;
        int actual = decaJavelinThrow.calculateResult(testData);
        assertEquals(expected, actual);    }

    @Test public void  testDecaLongJumpValidLength() {
        DecaLongJump decaLongJump = new DecaLongJump() ;
        int expected = 1010;
        double testData = 780;
        int actual = decaLongJump.calculateResult(testData);
        assertEquals(expected, actual);
    }
    @Test public void  testDecaPoleVaultValidLength() {
        DecaPoleVault decaPoleVault = new DecaPoleVault() ;
        int expected = 1004;
        double testData = 530;
        int actual = decaPoleVault.calculateResult(testData);
        assertEquals(expected, actual);
    }
    @Test public void  testDecaShotPutValidLength() {
        DecaShotPut decaShotPut = new DecaShotPut() ;
        int expected = 805;
        double testData = 15.25;
        int actual = decaShotPut.calculateResult(testData);
        assertEquals(expected, actual);
    }

}

