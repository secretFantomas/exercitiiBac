package Var003;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class S3_1Test {

    @Test
    public void testMatrix_arrayList() {
        S3_1 subject = new S3_1();
        int n=5;

        List<List<Integer>> expectedResult = new ArrayList<List<Integer>>() ;
        expectedResult.add(Arrays.asList(1,1,1,1,1));
        expectedResult.add(Arrays.asList(2,1,1,1,2));
        expectedResult.add(Arrays.asList(2,2,1,2,2));
        expectedResult.add(Arrays.asList(2,1,1,1,2));
        expectedResult.add(Arrays.asList(1,1,1,1,1));

        List<List<Integer>> receivedResult = subject.S3_1_withArrayList(n);

        assertEquals(expectedResult, receivedResult);
    }

    @Test
    public void testMatrix() {
        S3_1 subject = new S3_1();
        int n=5;

        int[][] matrix = {{1,1,1,1,1}, {2,1,1,1,2}, {2,2,1,2,2}, {2,1,1,1,2},{1,1,1,1,1}};

        int[][] expectedMatrix = {{1,1,1,1,1}, {2,1,1,1,2}, {2,2,1,2,2}, {2,1,1,1,2},{1,1,1,1,1}};
        int[][] receivedResult = subject.S3_1(matrix);

        assertEquals(expectedMatrix, receivedResult);

    }
}