package org.fasttrackit.homework;

public enum DaysOfTheWeek {MONDAY("M"), TUESDAY("TU"), WEDNESDAY("W"), THURSDAY("TH"), FRIDAY("F"), SATURDAY("SA"), SUNDAY("SU");


    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    DaysOfTheWeek(String symbol) {

    }

    public static DaysOfTheWeek fromSymbol(String symbol) {
        DaysOfTheWeek[] values = DaysOfTheWeek.values();
        for (DaysOfTheWeek cardinalPoint : values) {
            if (cardinalPoint.symbol.equals(symbol)) {
                return cardinalPoint;
            }
        }
        return null;
    }
}
