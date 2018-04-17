package Var003;

import org.junit.Test;

import static org.junit.Assert.*;

public class S3_2aTest {

    @Test
    public void receivedNr() {
        int number = 456789;
        S3_2a subject = new S3_2a();

        int expectedResult=6;
        int receivedResult = subject.receivedNr(number);
        assertEquals(expectedResult,receivedResult);
    }
}