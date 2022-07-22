package logic;

import java.util.ArrayList;
import java.util.List;

import model.Number;

public class CheckNumber {
    public static boolean isOddNumber(long number) {
        if (number % 2 == 1)
            return true;
        else return false;
    }

    public static boolean isDivisibleBy7(long number) {
        if (number % 7 == 0) return true;
        else return false;
    }

    public static boolean endsWith7(long number) {
        if (number % 10 % 10 == 7) return true;
        else return false;
    }

    public static boolean duckNumber(long number) {
        boolean isDuckNumber = false;
        long remainder;
        do {
            remainder = number % 10;
            number /= 10;
            if (remainder == 0) isDuckNumber = true;
        } while (number > 9);
        return isDuckNumber;
    }

    public static boolean palindromicNumber(long initialNumber) {
        boolean isPalindromicNumber = false;
        long number = initialNumber;
        long remainder;
        long reverse = 0;
        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        } while (number > 0);
        if (initialNumber == reverse) return true;
        else
            return false;
    }

    public static boolean gapfulNumber(long number) {
        String stringFromNumber = String.valueOf(number);
        if (stringFromNumber.length() >= 3) {
            String concatFirstLastNumber = String.valueOf(stringFromNumber.charAt(0)).concat(String.valueOf(stringFromNumber.charAt(stringFromNumber.length() - 1)));
            int concatFirstLast = Integer.valueOf(concatFirstLastNumber);
            if (number % concatFirstLast == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpyNumber(long number) {
        long remainder;
        int sum = 0;
        int mul = 1;
        while (number > 0) {
            remainder = number % 10;
            sum += remainder;
            mul *= remainder;
            number /= 10;
        }
        if (sum == mul) return true;
        else return false;
    }

}