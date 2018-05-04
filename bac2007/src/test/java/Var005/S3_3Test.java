package Var005;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class S3_3Test {

    @Test
    public void dublareLiteraInSirDeCaractere() {
        S3_3 subject = new S3_3();

        ArrayList<Character> values = new ArrayList<>();
        values.add('a');
        values.add('b');
        values.add('r');
        values.add('a');
        char letter = 'a';

        List<Character> expectedResult = Arrays.asList('a','a','b','r','a','a');;
        ArrayList<Character> receivedResult =subject.dublareLiteraInSirDeCaractere(values,letter);
        assertEquals(expectedResult, receivedResult);

    }

    @Test
    public void dublareLiteraInSirDeCaractereV2() {
        S3_3 subject = new S3_3();

        ArrayList<Character> values = new ArrayList<>();
        values.add('i');
        values.add('d');
        values.add('e');
        values.add('e');
        char letter = 'e';

        List<Character> expectedResult = Arrays.asList('i','d','e','e','e','e');;
        ArrayList<Character> receivedResult =subject.dublareLiteraInSirDeCaractere(values,letter);
        assertEquals(expectedResult, receivedResult);

    }

    public static void main(String[] args) {
//        System.out.println("Please insert a word: ");
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//
//        System.out.println("Your word is: " + str);
//
//        System.out.println("Please insert char: ");
//        char letter = 0;
//        try {
//            letter = (char) System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Your letter is: " + letter);

    }

}