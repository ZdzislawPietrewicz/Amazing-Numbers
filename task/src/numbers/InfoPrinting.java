package numbers;

import model.Number;

import java.util.List;

public class InfoPrinting {
    public static void welcomeUser (){
        System.out.println("");
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameter shows how many consecutive numbers are to be printed;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
        System.out.println("");
    }
    public static void handlingExceptionFirstParameter () {
        System.out.println("The first parameter should be a natural number or zero.");
    }
    public static void handlingExceptionSecondParameter () {
        System.out.println("TThe second parameter should be a natural number.");
    }
    public static void handlingExceptionWrongProperty (String property) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The property [").append(property).append("] is wrong.").append("\n");
        stringBuilder.append("Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY]");
        System.out.println(stringBuilder.toString());
    }
    public static void toString(List<Number> numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Number number : numbers) {
            stringBuilder.append(number.getNumber());
            stringBuilder.append(" is ");
            if (number.isBuzzNumber()==true) stringBuilder.append("buzz, ");
            if (number.isDuckNumber()==true) stringBuilder.append("duck, ");
            if (number.isPalindromicNumber()==true) stringBuilder.append("palindromic, ");
            if (number.isGapfulNumber()==true) stringBuilder.append("gapful, ");
            if (number.isSpyNumber()==true) stringBuilder.append("spy, ");
            if (number.isSquareNumber()) stringBuilder.append("square, ");
            if (number.isSunnyNumber()) stringBuilder.append("sunny, ");
            if (number.isOddNumber()==true) stringBuilder.append("odd"); else stringBuilder.append("even");
            stringBuilder.append("\n");

        }
        System.out.println(stringBuilder.toString());
    }
}