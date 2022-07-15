package numbers;

import model.Number;

public class InfoPrinting {
    public static void printOddOrEvenInfo(Number number) {
        if (number.isOddNumber()) System.out.println("This number is Odd.");
        else System.out.println("This number is Even.");
    }

    public static void printBuzzNumberInfo(Number number) {
        if (number.isBuzzNumber()) System.out.println("It is a Buzz number.");
        else System.out.println("It is not a Buzz number.");
        System.out.println("Explanation:");
        if (number.isDivisibleBy7() == true && number.isEndsWith7() == true) {
            System.out.printf("%d is divisible by 7 and ends with 7.", number.getNumber());
        } else if (number.isDivisibleBy7() == true && number.isEndsWith7() == false) {
            System.out.printf("%d is divisible by 7.", number.getNumber());
        } else if (number.isDivisibleBy7() == false && number.isEndsWith7() == true) {
            System.out.printf("%d ends with 7.", number.getNumber());
        } else if (number.isDivisibleBy7() == false && number.isEndsWith7() == false) {
            System.out.printf("%d is neither divisible by 7 nor does it end with 7.", number.getNumber());
        }
    }
}