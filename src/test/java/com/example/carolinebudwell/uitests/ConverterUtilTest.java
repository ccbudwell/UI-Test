package com.example.carolinebudwell.uitests;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by carolinebudwell on 3/11/18.
 */

public class ConverterUtilTest {

    @Test
    public void convertFarhenheitToCelsius() throws Exception {
        float input = 212;
        float output;
        float expected = 100;
        double delta = 0.1;

        ConverterUtil converterUtil = new ConverterUtil();
        output = converterUtil.convertFarhenheitToCelsius(input);

        assertEquals(expected, output, delta);
    }

    @Test
    public void convertCelsiusToFarhenheit() throws Exception {

        float input = 100;
        float output;
        float expected = 212;
        double delta = 0.1;

        ConverterUtil converterUtil = new ConverterUtil();
        output = converterUtil.convertCelsiusToFarhenheit(input);

        assertEquals(expected, output, delta);
    }

}
