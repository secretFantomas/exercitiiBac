package Variante2007.Var001_2007;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromTest {

    @Test
    void testPalindromFavorableCaseEven() {

        Palindrom number = new Palindrom();
        int numberToCheck = 12321;

        boolean expectedResult = true;
        boolean receivedResult = number.isPalinfromV1(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }


    @Test
    void testPalindromUnFavorableCaseEven() {
        Palindrom number = new Palindrom();

        int numberToCheck= 13254;

        boolean expectedResult = false;
        boolean receivedResult = number.isPalinfromV1(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    void testPalindromFavorableCaseOdd() {

        Palindrom number = new Palindrom();
        int numberToCheck = 123321;

        boolean expectedResult = true;
        boolean receivedResult = number.isPalinfromV1(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    void testPalindromUnFavorableCaseOdd() {
        Palindrom number = new Palindrom();

        int numberToCheck= 132554;

        boolean expectedResult = false;
        boolean receivedResult = number.isPalinfromV1(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    void testPalindromFavorableCaseEven2() {

        Palindrom number = new Palindrom();
        int numberToCheck = 12321;

        boolean expectedResult = true;
        boolean receivedResult = number.isPalindromV2(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }


    @Test
    void testPalindromUnFavorableCaseEven2() {
        Palindrom number = new Palindrom();

        int numberToCheck= 13254;

        boolean expectedResult = false;
        boolean receivedResult = number.isPalindromV2(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    void testPalindromFavorableCaseOdd2() {

        Palindrom number = new Palindrom();
        int numberToCheck = 123321;

        boolean expectedResult = true;
        boolean receivedResult = number.isPalindromV2(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    void testPalindromUnFavorableCaseOdd2() {
        Palindrom number = new Palindrom();

        int numberToCheck= 132554;

        boolean expectedResult = false;
        boolean receivedResult = number.isPalindromV2(numberToCheck);

        assertEquals(expectedResult, receivedResult);
    }
}