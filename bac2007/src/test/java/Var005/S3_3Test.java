package Var005;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S3_3Test {

    @Test
    public void dublareLiteraInSirDeCaractere() {

        String[] values = {"a", "b", "r", "a", "c", "a", "d", "a", "b", "r", "a"};
        String letter = "a";

        String[] expectedResult = {"a", "b", "r", "a", "c", "a", "d", "a", "b", "r", "a"};


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

        String[] values = {"a", "b", "r", "a", "c", "a", "d", "a", "b", "r", "a"};
        List<String[]> list = new ArrayList<>();

        list.add(values);
        System.out.println(list.get(6));


    }
}