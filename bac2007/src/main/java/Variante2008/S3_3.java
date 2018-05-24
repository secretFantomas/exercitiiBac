package Variante2008;

import java.util.ArrayList;

public class S3_3 {

    public ArrayList<Integer> divizibil(ArrayList<Integer> list, int nr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) % nr == 0)
                result.add(list.get(i));
        }

        if (result.size() == 0) {
            result.add(0);
            System.out.println("NU EXISTA");
        }
        return result;
    }

    public static void recursiv (long nr){
        System.out.println(nr%10);
        if (nr!=0){
            recursiv (nr/100);
            System.out.println(nr%10);
        }
    }

    public static void main(String[] args) {
        recursiv(12345);
    }
}
