package Variante2007.Var005;

import org.junit.Test;
import static org.junit.Assert.*;

public class S3_1Test {

    @Test
    public void matriceCuSemidiagonaleTest() {
        S3_1 subject = new S3_1();
        int n=5;

        int [][] matrix = {{1,2,3,4,5},{2,3,4,5,4},{3,4,5,4,3},{4,5,4,3,2},{5,4,3,2,1}};
        int [][] expectedResult = {{1,2,3,4,5},{2,3,4,5,4},{3,4,5,4,3},{4,5,4,3,2},{5,4,3,2,1}};
        int [][] receivedResult = subject.matriceCuSemidiagonale(matrix);

        assertEquals(expectedResult,receivedResult);
    }
}