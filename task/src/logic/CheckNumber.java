package logic;

import java.util.ArrayList;
import java.util.List;

import model.Number;

public class CheckNumber {
    public static boolean isOddNumber(int number) {
        if (number % 2 == 1)
            return true;
        else return false;
    }

    public static boolean isDivisibleBy7(int number) {
        if (number % 7 == 0) return true;
        else return false;
    }

    public static boolean endsWith7(int number) {
        if (number % 10 % 10 == 7) return true;
        else return false;
    }
}