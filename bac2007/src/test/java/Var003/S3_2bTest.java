package Var003;

import org.junit.Test;

import static org.junit.Assert.*;

public class S3_2bTest {

    @Test
    public void cifreDiferite() {
        S3_2b subject = new S3_2b();
        int number = 4566;
        int a=6;
        int b=2;

        int expectedValue = 2;
        int receivedValue = subject.cifreDiferite(number, a,b);
        assertEquals(expectedValue, receivedValue);

    }



}