package model;

public class Number {
    private int number;
    private boolean oddNumber;
    private boolean buzzNumber;
    private boolean divisibleBy7;
    private boolean endsWith7;

    public Number(int number, boolean oddNumber, boolean divisibleBy7, boolean endsWith7) {
        this.number = number;
        this.oddNumber = oddNumber;
        this.divisibleBy7 = divisibleBy7;
        this.endsWith7 = endsWith7;
        if (divisibleBy7 || endsWith7) {
            buzzNumber = true;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
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
}
