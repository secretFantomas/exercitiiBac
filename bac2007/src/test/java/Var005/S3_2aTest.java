package Var005;

import org.junit.Test;

import static org.junit.Assert.*;

public class S3_2aTest {

    @Test
    public void eliminareaPrimeiAparitiiAUneiCifreInNumar() {
        S3_2a subject = new S3_2a();
        int numar = 1234516;
        int cifra = 1;

        int expectedResult = 234516;
        int receivedResult = subject.eliminareaPrimeiAparitiiAUneiCifreInNumar(numar,cifra);

        assertEquals(expectedResult, receivedResult);
    }
}