package dev.ghector6.currencyconverter.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CurrencyQuery currencyQuery = new CurrencyQuery();
        Currency currency = currencyQuery.searchCurrency();
        CurrencyConversion currencyConversion = new CurrencyConversion();
        Scanner scan = new Scanner(System.in);
        double result = 0.0;
        double quantity;
        int inputNumber = 0;
        while (inputNumber != 7) {
            System.out.println("********************************");
            System.out.println("Welcome to currency converter! ");
            System.out.println("Choose an option");
            System.out.println("1) USD => MXN ");
            System.out.println("2) MXN => USD ");
            System.out.println("3) EUR => MXN ");
            System.out.println("4) MXN => EUR ");
            System.out.println("5) CAD => MXN ");
            System.out.println("6) MXN => CAD ");
            System.out.println("7) EXIT: ");
            System.out.println("********************************\n");
            inputNumber = scan.nextInt();
            if(inputNumber == 7){
                System.out.println("Thanks, see you next time");
                break;
            }else{
                System.out.println("Type amount to convert");
                quantity = scan.nextDouble();
                CurrencyOptions currencyOptions = CurrencyOptions.fromOption(inputNumber);
                result = currencyConversion.currencyConversion(currencyOptions, currency, quantity);
                System.out.println(result);

            }
        }
    }

}
