package com.company;
class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int q, digit, result = 0;
        q = number;

        while (q != 0) {
            digit = q % 10;
            result = (result * 10) + digit;
            q /= 10;
        }
        if (number == result) {
            return true;
        } else
            return false;

    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println(NumberPalindrome.isPalindrome(2002));
    }
}
