package Var009;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class S3_3Test {

    @Test
    public void verificaECreastaTest() {
        S3_3 subject = new S3_3();

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,12,17,26,15,3));
        int receivedResult = subject.verificaCreasta(input);
        int expectedResult = 26;

        assertEquals(expectedResult,receivedResult);
    }

    @Test
    public void verificaNuECreastaTest() {
        S3_3 subject = new S3_3();

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,12,17,10,15,3));
        int receivedResult = subject.verificaCreasta(input);
        int expectedResult = 0;

        assertEquals(expectedResult,receivedResult);
    }
}