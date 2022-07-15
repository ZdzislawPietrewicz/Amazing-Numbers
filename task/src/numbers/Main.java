package numbers;

import logic.CheckNumber;
import model.Number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InfoPrinting.welcomeUser();
        long inputNumber;
        do {
            System.out.println("");
            System.out.print("Enter a request: > ");
            Scanner scanner = new Scanner(System.in);
            inputNumber = scanner.nextLong();
            scanner.nextLine();

            if (inputNumber > 0) {
                Number number = new Number(inputNumber, CheckNumber.isOddNumber(inputNumber), CheckNumber.isDivisibleBy7(inputNumber),
                        CheckNumber.endsWith7(inputNumber), CheckNumber.duckNumber(inputNumber), CheckNumber.palindromicNumber(inputNumber));
                System.out.println(number);
            } else {
                System.out.println("The first parameter should be a natural number or zero.");
            }
        } while (inputNumber != 0);
        System.out.println("Goodbye!");
    }
}
