package Variante2007.Var010;

import java.util.ArrayList;

public class S3_3 {

    public ArrayList<Integer> maxime(ArrayList<Integer> list) {
        int maxim1 = list.get(1), maxim2 = list.get(2);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxim1) {
                maxim2=maxim1;
                maxim1 = list.get(i);
            } else if (list.get(i) > maxim2) {
                maxim1 = list.get(i);
            }
        }

        result.add(maxim1);
        result.add(maxim2);

        return result;
    }
}
