package Variante2007.Var009;

import java.util.ArrayList;

public class S3_3 {
    //sa se afiseze daca sirul contine sau nu creasta

    public Integer verificaCreasta(ArrayList<Integer> list){
         int creasta=0;
         int pozitieCreasta = 0;
         boolean eCreasta=false;

        for (int i=0; i<list.size()-1;i++) {
            if (!(list.get(i + 1) > list.get(i)))
                break;
            else {
                creasta = list.get(i + 1);
                pozitieCreasta = i + 1;
            }
        }

        for (int i=pozitieCreasta; i<list.size()-1;i++){
            if (list.get(i + 1) < list.get(i))
                eCreasta=true;
            else
            {
                eCreasta=false;
                break;
            }
        }

        if(eCreasta)
            return creasta;
        else
            return 0;

    }

}
