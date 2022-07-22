package numbers;

import logic.CheckNumber;
import model.Number;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        InfoPrinting.welcomeUser();
        List<Number> userInputArray = new ArrayList<>();
        List<String> userRequestArguments;
        Number number;
        do {
            System.out.print("Enter a request: > ");
            Scanner scanner = new Scanner(System.in);
            userRequestArguments = Arrays.asList(scanner.nextLine().split("\\s"));
            long valueSecondArgument;
            if (!userRequestArguments.get(0).equals("")) {
                switch (userRequestArguments.size()) {
                    case 1:
                        try {
                            long longValue = Long.parseLong(userRequestArguments.get(0));
                            if (longValue > 0) {
                                number = createNewNumber(longValue);
                                System.out.println(number);
                            } else if (longValue < 0) {
                                throw new NumberFormatException();
                            }

                        } catch (NumberFormatException e) {
                            InfoPrinting.handlingExceptionFirstParameter();
                        }
                        break;
                    case 2:
                        long valueFirstArgument = Long.parseLong(userRequestArguments.get(0));
                        try {
                            valueSecondArgument = Long.parseLong(userRequestArguments.get(1));
                            if (valueSecondArgument > 0) {
                                for (int i = 0; i < valueSecondArgument; i++) {
                                    userInputArray.add(createNewNumber(valueFirstArgument + i));
                                }
                                InfoPrinting.toString(userInputArray);
                            } else {
                                throw new NumberFormatException();
                            }
                        } catch (NumberFormatException e) {
                            InfoPrinting.handlingExceptionSecondParameter();
                        }
                        break;
                    case 3:
                        valueFirstArgument = Long.parseLong(userRequestArguments.get(0));
                        valueSecondArgument = Long.parseLong(userRequestArguments.get(1));
                        switch (userRequestArguments.get(2).toUpperCase()) {
                            case "ODD":
                                do {
                                    if (CheckNumber.isOddNumber(valueFirstArgument)) {
                                        userInputArray.add(createNewNumber(valueFirstArgument));
                                        valueSecondArgument--;
                                    }
                                    valueFirstArgument++;
                                } while (valueSecondArgument > 0);
                                break;
                            case "EVEN":
                                do {
                                    if (!CheckNumber.isOddNumber(valueFirstArgument)) {
                                        userInputArray.add(createNewNumber(valueFirstArgument));
                                        valueSecondArgument--;
                                    }
                                    valueFirstArgument++;
                                } while (valueSecondArgument > 0);
                                break;
                            case "BUZZ":
                                do {
                                    if (CheckNumber.isDivisibleBy7(valueFirstArgument) || CheckNumber.endsWith7(valueFirstArgument)) {
                                        userInputArray.add(createNewNumber(valueFirstArgument));
                                        valueSecondArgument--;
                                    }
                                    valueFirstArgument++;
                                } while (valueSecondArgument > 0);
                                break;
                            case "DUCK":
                                do {
                                    if (CheckNumber.duckNumber(valueFirstArgument)) {
                                        userInputArray.add(createNewNumber(valueFirstArgument));
                                        valueSecondArgument--;
                                    }
                                    valueFirstArgument++;
                                } while (valueSecondArgument > 0);
                                break;
                            case "PALINDROMIC":
                                do {
                                    if (CheckNumber.palindromicNumber(valueFirstArgument)) {
                                        userInputArray.add(createNewNumber(valueFirstArgument));
                                        valueSecondArgument--;
                                    }
                                    valueFirstArgument++;
                                } while (valueSecondArgument > 0);
                                break;
                            case "GAPFUL":
                                do {
                                    if (CheckNumber.gapfulNumber(valueFirstArgument)) {
                                        userInputArray.add(createNewNumber(valueFirstArgument));
                                        valueSecondArgument--;
                                    }
                                    valueFirstArgument++;
                                } while (valueSecondArgument > 0);
                                break;
                            case "SPY":
                                do {
                                    if (CheckNumber.isSpyNumber(valueFirstArgument)) {
                                        userInputArray.add(createNewNumber(valueFirstArgument));
                                        valueSecondArgument--;
                                    }
                                    valueFirstArgument++;
                                } while (valueSecondArgument > 0);
                                break;
                            case "SQUARE":
                                do {
                                    if (CheckNumber.isSquareNumber(valueFirstArgument)) {
                                        userInputArray.add(createNewNumber(valueFirstArgument));
                                        valueSecondArgument--;
                                    }
                                    valueFirstArgument++;
                                } while (valueSecondArgument > 0);
                                break;
                            case "SUNNY":
                                do {
                                    if (CheckNumber.isSunnyNumber(valueFirstArgument)) {
                                        userInputArray.add(createNewNumber(valueFirstArgument));
                                        valueSecondArgument--;
                                    }
                                    valueFirstArgument++;
                                } while (valueSecondArgument > 0);
                                break;
                            default:
                                InfoPrinting.handlingExceptionWrongProperty(userRequestArguments.get(2).toUpperCase());
                                break;
                        }
                        InfoPrinting.toString(userInputArray);
                }

                userInputArray.clear();
            }
        }
        while (!userRequestArguments.get(0).equals("0"));
        System.out.println("Goodbye!");
    }


    private static Number createNewNumber(long longValue) {
        Number number = new Number(longValue, CheckNumber.isOddNumber(longValue),
                CheckNumber.isDivisibleBy7(longValue), CheckNumber.endsWith7(longValue),
                CheckNumber.duckNumber(longValue), CheckNumber.palindromicNumber(longValue),
                CheckNumber.gapfulNumber(longValue), CheckNumber.isSpyNumber(longValue),CheckNumber.isSquareNumber(longValue),
                CheckNumber.isSunnyNumber(longValue));
        return number;
    }
}
