package Var003;

import java.util.ArrayList;

public class S3_2a {

    public int receivedNr(int number){
        ArrayList<Integer> list = new ArrayList<>();

        while (number!=0) {
            number = number / 10;
            list.add(number);
        }
        return list.size();
    }
}
