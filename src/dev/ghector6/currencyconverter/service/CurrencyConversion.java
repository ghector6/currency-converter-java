package dev.ghector6.currencyconverter.service;

import dev.ghector6.currencyconverter.model.Currency;
import dev.ghector6.currencyconverter.model.CurrencyOptions;

public class CurrencyConversion {

    public double currencyConversion(CurrencyOptions options, Currency currency, double quantity) {
        double fromCurrency = currency.conversionRates().get(options.getFrom());
        double toCurrency = currency.conversionRates().get(options.getTo());
        return (quantity * toCurrency) / fromCurrency;
    }
}