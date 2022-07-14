package model;

public class Number {
    private int number;
    private boolean oddNumber;
    private boolean buzzNumber;

    public Number(int number) {
        this.number = number;
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
}
