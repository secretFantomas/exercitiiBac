package Variante2007.Var008;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class S3_3Test {

    @Test
    public void convertStringToArrayList() {
        S3_3 subject = new S3_3();

        String input ="127 22 74 6";

        List<Integer> expectedResult = new ArrayList<Integer>() ;
        expectedResult.add(127);
        expectedResult.add(22);
        expectedResult.add(74);
        expectedResult.add(6);
        ArrayList<Integer> receivedResult = subject.convertStringToArrayList(input);

        assertEquals(expectedResult,receivedResult);
    }

    @Test
    public void convertStringToArrayListMutipleLines() {
        S3_3 subject = new S3_3();

        String input ="127 22 74 6"+ System.lineSeparator()+"12755 225 174 36";

        List<Integer> expectedResult = new ArrayList<Integer>() ;
        expectedResult.add(127);
        expectedResult.add(22);
        expectedResult.add(74);
        expectedResult.add(6);
        expectedResult.add(12755);
        expectedResult.add(225);
        expectedResult.add(174);
        expectedResult.add(36);
        ArrayList<Integer> receivedResult = subject.convertStringToArrayList(input);

        assertEquals(expectedResult,receivedResult);
    }

    @Test
    public void countListElementsTest() {
        S3_3 subject = new S3_3();
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(7,22,7,6,10,10,6,22,6,10,22,10));

        HashMap<Integer,Integer>expectedResult = new HashMap<>();
        expectedResult.put(6,3);
        expectedResult.put(7,2);
        expectedResult.put(10,4);
        expectedResult.put(22,3);

        HashMap<Integer,Integer> receivedResult = subject.countListElements(input);

        assertEquals(expectedResult,receivedResult);

    }

}