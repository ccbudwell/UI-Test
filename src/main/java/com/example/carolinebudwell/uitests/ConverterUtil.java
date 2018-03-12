package com.example.carolinebudwell.uitests;

/**
 * Created by carolinebudwell on 3/11/18.
 */

public class ConverterUtil {

    //Converts to Celsius
    public static float convertFarhenheitToCelsius(float farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    //Converts to Farhenheit
    public static float convertCelsiusToFarhenheit(float celsius) {
        return ((celsius * 9) / 5) + 32 + 100; //add + 100 so test fails
    }
}

