package Variante2007.Var003;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class S3_3Test {

    @Test
    public void stergeNrImpareDinCapeteleListei() {

        S3_3 subject3 = new S3_3();

        ArrayList<Integer> listaIntrare =  new ArrayList<>(Arrays.asList(1,3,56 ,13,456,111,45,789,56,22,47,478,17));
        int expectedResult = 10;
        int receivedResult = subject3.stergeNrImpareDinCapeteleListei(listaIntrare);

        assertEquals(expectedResult,receivedResult);
    }

    @Test
    public void stergeNrImpareDinCapeteleListei_ValoriPare() {

        S3_3 subject3 = new S3_3();

        List<Integer> listaIntrare = Arrays.asList(22,56 ,13,456,111,45,789,56);
        int expectedResult = 8;
        int receivedResult = subject3.stergeNrImpareDinCapeteleListei(listaIntrare);

        assertEquals(expectedResult,receivedResult);
    }
}