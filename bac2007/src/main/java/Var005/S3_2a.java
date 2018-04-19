package Var005;

import java.util.ArrayList;

public class S3_2a {

    public int eliminareaPrimeiAparitiiAUneiCifreInNumar(int number, int cifra){
        int result = 0;
        return result;

    }

    public static boolean checkLenghtOfNumber( int number){
        ArrayList<Integer> list = new ArrayList<>();

        while (number !=0){
            number = number/10;

        }
        list.add(number);
        if (list.size()>8){
            System.out.println("nr e mai mare de 8 " + list.get(0));
            return false;
        }

        System.out.println("nr e: " + list.get(0));
        return true;
    }

    public static void main(String[] args) {
        checkLenghtOfNumber(123456789);

    }

}
