import decathlon.*;
import heptathlon.*;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;

public class TestRunner {

    @Test
    public void testDeca100validTime() throws InvalidResultException {
        Deca100M deca100M = new Deca100M();
        int expected = 926;
        double testData = 10.71;
        int actual = deca100M.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeca110MHurdlesValidTime() throws InvalidResultException {
        Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
        int expected = 942;
        double testData = 14.25;
        int actual = deca110MHurdles.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeca400MValidRunningTime() throws InvalidResultException {
        Deca400M deca400M = new Deca400M();
        int expected = 924;
        double testData = 47.69;
        int actual = deca400M.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeca1500MValidRunningTime() throws InvalidResultException {
        Deca1500M deca1500M = new Deca1500M();
        int expected = 687;
        double testData = 279;
        int actual = deca1500M.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecaDiscusThrowValidLength() throws InvalidResultException {
        DecaDiscusThrow decaDiscusThrow = new DecaDiscusThrow();
        int expected = 866;
        double testData = 49.80;
        int actual = decaDiscusThrow.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecaHighJumpValidHight() throws InvalidResultException {
        DecaHighJump decahighjump = new DecaHighJump();
        int expected = 794;
        double testData = 199;
        int actual = decahighjump.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecaJavelinThrowValidLength() throws InvalidResultException {
        DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
        int expected = 842;
        double testData = 66.87;
        int actual = decaJavelinThrow.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecaLongJumpValidLength() throws InvalidResultException {
        DecaLongJump decaLongJump = new DecaLongJump();
        int expected = 1010;
        double testData = 780;
        int actual = decaLongJump.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecaPoleVaultValidLength() throws InvalidResultException {
        DecaPoleVault decaPoleVault = new DecaPoleVault();
        int expected = 1004;
        double testData = 530;
        int actual = decaPoleVault.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecaShotPutValidLength() throws InvalidResultException {
        DecaShotPut decaShotPut = new DecaShotPut();
        int expected = 805;
        double testData = 15.25;
        int actual = decaShotPut.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testHep100MHurdlesValidTime() throws InvalidResultException {
        Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
        int expected = 1041;
        double testData = 13.56;
        int actual = hep100MHurdles.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testHep200MValidTime() throws InvalidResultException {
        Hep200M hep200M = new Hep200M();
        int expected = 937;
        double testData = 24.46;
        int actual = hep200M.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void testHep800MValidTime() throws InvalidResultException {
        Hep800M hep800M = new Hep800M();
        int expected = 956;
        double testData = 130.62;
        int actual = hep800M.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void  testHeptHightJumpValidHight() throws InvalidResultException {
        HeptHightJump heptHightJump = new HeptHightJump() ;
        int expected = 1132;
        double testData = 192;
        int actual = heptHightJump.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test

    public void  testHeptJavelinThrowValidLenght() throws InvalidResultException {
        HeptJavelinThrow heptJavelinThrow = new HeptJavelinThrow() ;
        int expected = 939;
        double testData = 54.04;
        int actual = heptJavelinThrow.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void  testHeptLongJumpValidLenght() throws InvalidResultException  {
        HeptLongJump heptLongJump = new HeptLongJump() ;
        int expected = 978;
        double testData = 641;
        int actual = heptLongJump.calculateResult(testData);
        assertEquals(expected, actual);
    }

    @Test
    public void  testHeptShotPutValidLenght() throws InvalidResultException  {
        HeptShotPut heptShotPut = new HeptShotPut() ;
        int expected = 897;
        double testData = 15.54;
        int actual = heptShotPut.calculateResult(testData);
        assertEquals(expected, actual);
    }
}