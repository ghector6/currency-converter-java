package dev.ghector6.currencyconverter.main;

public class CurrencyConversion {

    double currencyConversion(int option, Currency currency, double quantity) {

        double result = 0.0;
        if (option == 1) {
            double baseCurrency = currency.conversionRates().get("USD");
            double toCurrency = currency.conversionRates().get("MXN");
            result = (quantity * toCurrency) / baseCurrency;
        }else if(option == 2){
            double baseCurrency = currency.conversionRates().get("MXN");
            double toCurrency = currency.conversionRates().get("USD");
            result = (quantity * toCurrency) / baseCurrency;
        }else if(option == 3){
            double baseCurrency = currency.conversionRates().get("EUR");
            double toCurrency = currency.conversionRates().get("MXN");
            result = (quantity * toCurrency) / baseCurrency;
        }else if(option == 4){
            double baseCurrency = currency.conversionRates().get("MXN");
            double toCurrency = currency.conversionRates().get("EUR");
            result = (quantity * toCurrency) / baseCurrency;
        }else if(option == 5){
            double baseCurrency = currency.conversionRates().get("CAD");
            double toCurrency = currency.conversionRates().get("MXN");
            result = (quantity * toCurrency) / baseCurrency;
        }else if(option == 6){
            double baseCurrency = currency.conversionRates().get("MXN");
            double toCurrency = currency.conversionRates().get("CAD");
            result = (quantity * toCurrency) / baseCurrency;
        } else {
            throw new IllegalArgumentException("Invalid option: " + option);
        }
        return result;
    }
}