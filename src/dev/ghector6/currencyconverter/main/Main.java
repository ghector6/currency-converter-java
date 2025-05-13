package dev.ghector6.currencyconverter.main;
import dev.ghector6.currencyconverter.main.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CurrencyQuery currencyQuery = new CurrencyQuery();
        Currency currency = currencyQuery.searchCurrency();
        CurrencyUI consoleUi= new CurrencyUI(currency);
        consoleUi.start();



    }

}
