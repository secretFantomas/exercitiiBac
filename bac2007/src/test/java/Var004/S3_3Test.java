package Var004;

import org.junit.Test;

import static org.junit.Assert.*;

public class S3_3Test {

    @Test
    public void procesareString() {
        S3_3 subject = new S3_3();

        String inputString = "2+3-4+6+8-5=";
        String expectedResult = "2+3-4+6+8-5=10";
        String receivedResult = subject.procesareString(inputString);

        assertEquals(expectedResult,receivedResult);
    }
}