package dev.ghector6.currencyconverter.main;
import dev.ghector6.currencyconverter.model.Currency;
import dev.ghector6.currencyconverter.service.CurrencyQuery;
import dev.ghector6.currencyconverter.ui.CurrencyUI;

public class Main {
    public static void main(String[] args){
        CurrencyQuery currencyQuery = new CurrencyQuery();
        Currency currency = currencyQuery.searchCurrency();
        CurrencyUI consoleUi= new CurrencyUI(currency);
        consoleUi.start();



    }

}
