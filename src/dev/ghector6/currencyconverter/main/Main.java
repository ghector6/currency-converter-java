package dev.ghector6.currencyconverter.main;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        CurrencyQuery currencyQuery = new CurrencyQuery();
        Currency currency = currencyQuery.searchCurrency();
        System.out.println(currency.conversionRates());
    }
}
