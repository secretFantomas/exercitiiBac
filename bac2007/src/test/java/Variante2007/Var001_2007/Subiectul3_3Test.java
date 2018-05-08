package Variante2007.Var001_2007;

import org.junit.Test;

import static org.junit.Assert.*;

public class Subiectul3_3Test {

    @Test
    public void citireAlfabet() {

        String inputValue = "MAMA";
        String expectedValue = "MAMA" + System.lineSeparator()
                +"MAM" + System.lineSeparator()
                +"MA" + System.lineSeparator()
                +"M";

        Subiectul3_3 subiectul3_3 = new Subiectul3_3();

        String returnValue = subiectul3_3.citireAlfabet(inputValue);

        assertEquals(expectedValue,returnValue);

    }
}