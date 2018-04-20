package Var005;

import java.util.ArrayList;

public class S3_3 {

    //se citeste un sir de cel mult 30 de caractere si o litera
    //se doreste dublarea fiecarei aparitii a literei
    public ArrayList<Character> dublareLiteraInSirDeCaractere(ArrayList<Character> sirIntrare, char letter){
        ArrayList<Character> result = new ArrayList<>();


           for(Character litera:sirIntrare){
            if (litera.equals(letter))
            {
                result.add(litera);
                result.add(letter);
            }

        }

        return result;

    }

}
