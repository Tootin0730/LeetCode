import java.lang.*;
import java.io.*;
import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        String firstOne = s.toLowerCase();
        firstOne = firstOne.replaceAll("\\s", "").replaceAll(",", "").replaceAll(":", "");
        System.out.println(firstOne);

        String newOne = s.toLowerCase();
        newOne = newOne.replaceAll("\\s", "").replaceAll(",", "").replaceAll(":", "");

        char[] reverse = newOne.toCharArray();
        String newResult = "";
        for (int i = reverse.length - 1; i >= 0; i--) {
            newResult += reverse[i];
        }
        System.out.println(newResult);

        if(firstOne.equals(newResult)){
            return true;
        } else{
            return false;
        }
    }
}