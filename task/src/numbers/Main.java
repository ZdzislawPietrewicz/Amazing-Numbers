package numbers;

import logic.CheckNumber;
import model.Number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a natural number");
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.nextLine();
        if (inputNumber > 0) {
            Number number = new Number(inputNumber, CheckNumber.isOddNumber(inputNumber), CheckNumber.isDivisibleBy7(inputNumber),
                    CheckNumber.endsWith7(inputNumber), CheckNumber.duckNumber(inputNumber));
            /*InfoPrinting.printOddOrEvenInfo(number);
            InfoPrinting.printBuzzNumberInfo(number);*/
            System.out.println(number);
        } else {
            System.out.println("This number is not natural!");
        }

    }
}
