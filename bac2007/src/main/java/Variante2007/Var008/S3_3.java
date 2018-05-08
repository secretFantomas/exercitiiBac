package Variante2007.Var008;

import java.util.ArrayList;
import java.util.HashMap;

public class S3_3 {

    public ArrayList<Integer> convertStringToArrayList(String input) {

//        List<Integer> result2 = Arrays
//                .stream(input.split(" "))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());


        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        StringBuilder sb = new StringBuilder();

        while (index < input.length()) {

            while ((index < input.length()) && (input.charAt(index) != ' ' && input.charAt(index) != '\r' && input.charAt(index) != '\n')) {
                char currentChar = input.charAt(index);
                sb.append(currentChar);
                index++;

            }
            if (sb.length() != 0)
                result.add(Integer.parseInt(sb.toString()));
            sb.delete(0, sb.length());
            index++;
        }
        return result;
    }

    public HashMap<Integer, Integer> countListElements(ArrayList<Integer> inputList) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (Integer valueOnList : inputList) {
            if (!result.containsKey(valueOnList)) {
                result.put(valueOnList, 1);
            } else {

                int value = result.get(valueOnList);
                value++;
                result.put(valueOnList, value);
            }

        }

        return result;
    }
}
