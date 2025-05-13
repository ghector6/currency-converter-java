package dev.ghector6.currencyconverter.ui;

import dev.ghector6.currencyconverter.model.Currency;
import dev.ghector6.currencyconverter.model.CurrencyOptions;
import dev.ghector6.currencyconverter.service.CurrencyConversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyUI {
    private final Currency currency;
    private final CurrencyConversion conversion = new CurrencyConversion();
    private final Scanner scanner = new Scanner(System.in);

    public CurrencyUI(Currency currency){
        this.currency = currency;
    }

    public void start(){
        int inputNumber = 0;
        while(inputNumber != 7){
            printMenu();
            inputNumber = readInt("Choose an option");
            if(inputNumber == 7){
                System.out.println("Thanks, see you next time!");
                break;
            }

            CurrencyOptions option = CurrencyOptions.fromOption(inputNumber);
            if(option == null){
                System.out.println("Invalid option");
                continue;
            }

            double amount = readDouble("Enter an amount to convert");
            double result = conversion.currencyConversion(option, currency, amount);
            System.out.printf("Result: %.2f %s%n%n", result, option.getTo());
        }

    }
    private void printMenu() {
        System.out.println("*******************************");
        System.out.println("Welcome to Currency Converter");
        for (CurrencyOptions opt : CurrencyOptions.values()) {
            System.out.printf("%d) %s => %s%n", opt.getOption(), opt.getFrom(), opt.getTo());
        }
        System.out.println("7) Exit");
        System.out.println("*******************************");
    }

    private int readInt(String prompt){
        while(true){
            System.out.println(prompt);
            try{
                return scanner.nextInt();

            }catch(InputMismatchException e){
                System.out.println("Invalid input. Select a number");
                scanner.nextLine();
            }
        }
    }

    private double readDouble(String prompt){
        while(true){
            System.out.println(prompt);
            try{
                return scanner.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Select a number");
                scanner.nextLine();
            }
        }
    }


}
