package Variante2007.Var004;

public class S3_3 {

    public String procesareString(String input) {
        int count=0;
        int index=0;

        count = Character.getNumericValue(input.charAt(index));
        index++;
        while (input.charAt(index)!='=')
        {

            if (input.charAt(index)=='+') {
                char curentChar = input.charAt(index + 1);
                int currentNumericValueForChar = Character.getNumericValue(curentChar);
                count+= currentNumericValueForChar;
            }
            else{
                char curentChar = input.charAt(index + 1);
                int currentNumericValueForChar = Character.getNumericValue(curentChar);
                count-= currentNumericValueForChar;
            }
            index=index+2;
        }

        String result =input +count;

        return result;
    }
}
