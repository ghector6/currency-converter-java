package dev.ghector6.currencyconverter.model;

import java.util.Map;

public record Currency(Map<String, Double> conversionRates) {

}
