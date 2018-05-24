package Variante2008;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class S3_3Test {

    @Test
    public void divizibil() {
        S3_3 subject = new S3_3();
        int numar=10;
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(3);
        inputList.add(100);
        inputList.add(40);
        inputList.add(70);
        inputList.add(25);
        inputList.add(5);
        inputList.add(80);
        inputList.add(6);
        inputList.add(3789);

        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList( 100,40,70,80));
        ArrayList<Integer> receivedResult = subject.divizibil(inputList, numar);
        assertEquals(expectedResult,receivedResult);

    }

    @Test
    public void nuEDivizibil() {
        S3_3 subject = new S3_3();
        int numar=17;
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(3);
        inputList.add(100);
        inputList.add(40);
        inputList.add(70);
        inputList.add(25);
        inputList.add(5);
        inputList.add(80);
        inputList.add(6);
        inputList.add(3789);

        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList( 0));
        ArrayList<Integer> receivedResult = subject.divizibil(inputList, numar);
        assertEquals(expectedResult,receivedResult);

    }
}