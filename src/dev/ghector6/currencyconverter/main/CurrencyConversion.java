package dev.ghector6.currencyconverter.main;

public class CurrencyConversion {
    double currencyConversion(int option, Currency currency) {
        double result = 0.0;

        if (option == 0) {
            double baseCurrency = currency.conversionRates().get("USD");
            double toCurrency = currency.conversionRates().get("MXN");
            result = baseCurrency * toCurrency;
        } else {
            throw new IllegalArgumentException("Invalid option: " + option);
        }
        return result;
    }
}