package Var010;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class S3_3Test {

    @Test
    public void maxime() {
        S3_3 subject = new S3_3();

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,11,7,3,8,-2,11,11,-7,5));
        ArrayList<Integer> receivedResult = subject.maxime(input);
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(11,8));

        assertEquals(expectedResult,receivedResult);
    }
}