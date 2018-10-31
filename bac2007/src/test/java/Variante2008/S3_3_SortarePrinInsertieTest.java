package Variante2008;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class S3_3_SortarePrinInsertieTest {

    @Test
    public void sortarePrinInsertie() {
        S3_3_SortarePrinInsertie subject = new S3_3_SortarePrinInsertie();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2,0,3,-1,1,0,2,3,4,1,0));
        ArrayList<Integer> expectedResult =  new ArrayList<>(Arrays.asList(-2,-1,0,0,0,1,1,2,3,3,4));
        ArrayList<Integer> receivedResult = subject.sortarePrinInsertie(input);

        assertEquals(expectedResult,receivedResult);
    }
}