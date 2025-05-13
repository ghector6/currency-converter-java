package dev.ghector6.currencyconverter.model;

public enum CurrencyOptions {
    USD_TO_MXN(1, "USD", "MXN"),
    MXN_TO_USD(2, "MXN", "USD"),
    EUR_TO_MXN(3, "EUR", "MXN"),
    MXN_TO_EUR(4, "MXN", "EUR"),
    CAD_TO_MXN(5, "CAD", "MXN"),
    MXN_TO_CAD(6, "MXN", "CAD");

    private final int option;
    private final String from;
    private final String to;

    CurrencyOptions(int option, String from, String to) {
        this.option = option;
        this.from = from;
        this.to = to;
    }

    public int getOption() { return option; }

    public String getFrom() { return from; }

    public String getTo() { return to; }

    public static CurrencyOptions fromOption(int option) {
        for (CurrencyOptions c : values()) {
            if (c.option == option) return c;
        }
        return null;
    }
}
