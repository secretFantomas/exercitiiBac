package Var010;

import org.junit.Test;

import static org.junit.Assert.*;

public class S3_1Test {

    @Test
    public void populareValoriInverseTest() {
        S3_1 subject = new S3_1();
        int n=5;

        int[][] matrix = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20},{21,22,23,24,25}};

        int[][] expectedMatrix = {{1,2,3,4,5}, {10,9,8,7,6}, {11,12,13,14,15}, {20,19,18,17,16},{21,22,23,24,25}};
        int[][] receivedResult = subject.populareValoriInverse(matrix);

        assertEquals(expectedMatrix, receivedResult);

    }

}