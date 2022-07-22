package model;

import java.util.ArrayList;
import java.util.List;

public class Number {
    private long number;
    private boolean oddNumber;
    private boolean buzzNumber;
    private boolean divisibleBy7;
    private boolean endsWith7;
    private boolean duckNumber;
    private boolean palindromicNumber;
    private boolean gapfulNumber;
    private boolean isSpyNumber;
    private boolean isSquareNumber;
    private boolean isSunnyNumber;

    public Number(long number, boolean oddNumber, boolean divisibleBy7, boolean endsWith7, boolean duckNumber,
                  boolean palindromicNumber, boolean gapfulNumber, boolean isSpyNumber, boolean isSquareNumber, boolean isSunnyNumber) {
        this.number = number;
        this.oddNumber = oddNumber;
        this.divisibleBy7 = divisibleBy7;
        this.endsWith7 = endsWith7;
        if (divisibleBy7 || endsWith7) {
            buzzNumber = true;
        }
        this.duckNumber = duckNumber;
        this.palindromicNumber = palindromicNumber;
        this.gapfulNumber = gapfulNumber;
        this.isSpyNumber = isSpyNumber;
        this.isSquareNumber = isSquareNumber;
        this.isSunnyNumber = isSunnyNumber;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public boolean isOddNumber() {
        return oddNumber;
    }

    public void setOddNumber(boolean oddNumber) {
        this.oddNumber = oddNumber;
    }

    public boolean isBuzzNumber() {
        return buzzNumber;
    }

    public void setBuzzNumber(boolean buzzNumber) {
        this.buzzNumber = buzzNumber;
    }

    public boolean isDivisibleBy7() {
        return divisibleBy7;
    }

    public void setDivisibleBy7(boolean divisibleBy7) {
        this.divisibleBy7 = divisibleBy7;
    }

    public boolean isEndsWith7() {
        return endsWith7;
    }

    public void setEndsWith7(boolean endsWith7) {
        this.endsWith7 = endsWith7;
    }

    public boolean isDuckNumber() {
        return duckNumber;
    }

    public void setDuckNumber(boolean duckNumber) {
        this.duckNumber = duckNumber;
    }

    public boolean isPalindromicNumber() {
        return palindromicNumber;
    }

    public void setPalindromicNumber(boolean palindromicNumber) {
        this.palindromicNumber = palindromicNumber;
    }

    public boolean isGapfulNumber() {
        return gapfulNumber;
    }

    public void setGapfulNumber(boolean gapfulNumber) {
        this.gapfulNumber = gapfulNumber;
    }

    public boolean isSpyNumber() {
        return isSpyNumber;
    }

    public void setSpyNumber(boolean spyNumber) {
        isSpyNumber = spyNumber;
    }

    public boolean isSquareNumber() {
        return isSquareNumber;
    }

    public void setSquareNumber(boolean squareNumber) {
        isSquareNumber = squareNumber;
    }

    public boolean isSunnyNumber() {
        return isSunnyNumber;
    }

    public void setSunnyNumber(boolean sunnyNumber) {
        isSunnyNumber = sunnyNumber;
    }

    @Override
    public String toString() {
        return "Properties of " + number + "\n" +
                "even: " + !oddNumber + "\n" +
                "odd: " + oddNumber + "\n" +
                "buzz: " + buzzNumber + "\n" +
                "duck: " + duckNumber + "\n" +
                "palindromic: " + palindromicNumber + "\n" +
                "gapful: " + gapfulNumber + "\n" +
                "spy: " + isSpyNumber + "\n" +
                "square: " + isSquareNumber + "\n" +
                "sunny: " + isSunnyNumber + "\n";
    }
}
