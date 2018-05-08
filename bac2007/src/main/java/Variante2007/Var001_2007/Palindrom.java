package Variante2007.Var001_2007;

import java.util.ArrayList;

public class Palindrom {
        private ArrayList<Integer> list = new ArrayList<Integer>();

        public Boolean isPalinfromV1(int numberToCheck) {
            int newNumber = 0;
            int oldNumber = numberToCheck;
            int divisionReminder;
            while (numberToCheck != 0) {
                divisionReminder = numberToCheck % 10;
                newNumber = newNumber * 10 + divisionReminder;
                numberToCheck /= 10;

            }
            return oldNumber == newNumber;
        }

        public Boolean isPalindromV2(int numberToCheck) {

            int divisionReminder;

            while (numberToCheck != 0) {
                divisionReminder = numberToCheck % 10;
                numberToCheck /= 10;
                list.add(divisionReminder);
            }

            for (int i = 0; i < list.size() / 2; i++)
                if (!(list.get(i) == list.get(list.size() - i - 1)))
                    return false;

            return true;
        }
    }


