package utils;

public class CurrencyConverter {
    public static final double dollarPrice = 5.30;
    public static final double iof = 0.06;

    public static double converter(double value) {
        return (value * dollarPrice) + (value * dollarPrice * iof);
    }
}
