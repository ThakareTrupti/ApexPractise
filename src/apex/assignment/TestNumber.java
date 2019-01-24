/*Write a java program with following methods:
 public Boolean IsInteger(String str)
 public Boolean IsOddNumber(String str)
 public Boolean IsEvenNumber(String str)
public Boolean IsPrimeNumber(String str)*/

package apex.assignment;

import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args) {

        TestNumber t = new TestNumber();
        System.out.println(t.IsInteger("123"));
        System.out.println(t.IsOddNumber("122"));


    }

    public Boolean IsInteger(String str) {

        try {
            int number = Integer.valueOf(str);
            return true;
        } catch (Exception ex) {
            return false;
        }


            /*for(int i=0;i<str.length();i++) {
                char ch = str.charAt(i);
                if ( !(ch >= '0' && ch <='9')) {
                    return false;
                } */

        // return true;


    }

    public Boolean IsOddNumber(String str) {
        //String s = "123";

        /* converting the string to an int value
         * ,the value of inum2 would be 123 after
         * conversion
         */
        int inum = Integer.parseInt(str);

        if (inum / 2 == 0)
        {

            return false;

    }
    return true;
}
}
