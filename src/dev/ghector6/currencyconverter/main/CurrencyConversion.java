package dev.ghector6.currencyconverter.main;

public class CurrencyConversion {

    double currencyConversion(CurrencyOptions options, Currency currency, double quantity) {
        double fromCurrency = currency.conversionRates().get(options.getFrom());
        double toCurrency = currency.conversionRates().get(options.getTo());
        return (quantity * toCurrency) / fromCurrency;
    }
}