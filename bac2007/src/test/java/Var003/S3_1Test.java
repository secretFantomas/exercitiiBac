package Var003;

import org.junit.Test;

import static org.junit.Assert.*;

public class S3_1Test {

    @Test
    public void testMatrix_arrayList() {
        S3_1 subject = new S3_1();
        int n=5;

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