package Variante2007.Var003;

import java.util.List;

public class S3_3 {

    public int stergeNrImpareDinCapeteleListei(List<Integer> list){
        while(list.get(0)%2==1)
            list.remove(0);
        while(list.get(list.size()-1)%2==1)
            list.remove(list.size()-1);


        return list.size();
    }



}
