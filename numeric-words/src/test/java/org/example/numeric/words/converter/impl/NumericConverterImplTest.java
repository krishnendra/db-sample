package org.example.numeric.words.converter.impl;

import org.example.numeric.words.converter.NumericConverter;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NumericConverterImplTest {

    private NumericConverter numericConverter = new NumericConverterImpl();

    @Test
    public void testUnitNumber0(){
        int num = 0;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Zero");
    }

    @Test
    public void testUnitNumber5(){
        int num = 5;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Five");
    }

    @Test
    public void testUnitNumber9(){
        int num = 9;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Nine");
    }

    @Test
    public void testUnitNumber10(){
        int num = 10;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten");
    }

    @Test
    public void testUnitNumber11(){
        int num = 11;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Eleven");
    }

    @Test
    public void testUnitNumber12(){
        int num = 12;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Twelve");
    }

    @Test
    public void testUnitNumber19(){
        int num = 19;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Nineteen");
    }

    @Test
    public void testUnitNumber20(){
        int num = 20;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Twenty");
    }

    @Test
    public void testUnitNumber25(){
        int num = 25;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Twenty Five");
    }

    @Test
    public void testUnitNumber30(){
        int num = 30;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Thirty");
    }

    @Test
    public void testUnitNumber99(){
        int num = 99;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ninety Nine");
    }

    @Test
    public void testUnitNumber90(){
        int num = 90;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ninety");
    }

    @Test
    public void testUnitNumber100(){
        int num = 100;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"One hundred");
    }

    @Test
    public void testUnitNumber200(){
        int num = 200;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Two hundred");
    }

    @Test
    public void testUnitNumber303(){
        int num = 303;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Three hundred and Three");
    }

    @Test
    public void testUnitNumber410(){
        int num = 410;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Four hundred and Ten");
    }

    @Test
    public void testUnitNumber512(){
        int num = 512;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Five hundred and Twelve");
    }

    @Test
    public void testUnitNumber620(){
        int num = 620;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Six hundred and Twenty");
    }

    @Test
    public void testUnitNumber733(){
        int num = 733;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Seven hundred and Thirty Three");
    }

    @Test
    public void testUnitNumber1000(){
        int num = 1000;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"One thousand");
    }

    @Test
    public void testUnitNumber1005(){
        int num = 1005;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"One thousand and Five");
    }

    @Test
    public void testUnitNumber1010(){
        int num = 1010;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"One thousand and Ten");
    }

    @Test
    public void testUnitNumber1018(){
        int num = 1018;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"One thousand and Eighteen");
    }

    @Test
    public void testUnitNumber1020(){
        int num = 1020;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"One thousand and Twenty");
    }

    @Test
    public void testUnitNumber1099(){
        int num = 1099;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"One thousand and Ninety Nine");
    }

    @Test
    public void testUnitNumber1400(){
        int num = 1400;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"One thousand and Four hundred");
    }

    @Test
    public void testUnitNumber1445(){
        int num = 1445;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"One thousand, Four hundred and Forty Five");
    }

    @Test
    public void testUnitNumber9999(){
        int num = 9999;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Nine thousand, Nine hundred and Ninety Nine");
    }

    @Test
    public void testUnitNumber10000(){
        int num = 10000;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand");
    }

    @Test
    public void testUnitNumber10005(){
        int num = 10005;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand and Five");
    }

    @Test
    public void testUnitNumber10010(){
        int num = 10010;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand and Ten");
    }

    @Test
    public void testUnitNumber10014(){
        int num = 10014;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand and Fourteen");
    }

    @Test
    public void testUnitNumber10020(){
        int num = 10020;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand and Twenty");
    }

    @Test
    public void testUnitNumber10025(){
        int num = 10025;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand and Twenty Five");
    }

    @Test
    public void testUnitNumber10030(){
        int num = 10030;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand and Thirty");
    }

    @Test
    public void testUnitNumber10099(){
        int num = 10099;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand and Ninety Nine");
    }

    @Test
    public void testUnitNumber10100(){
        int num = 10100;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand and One hundred");
    }

    @Test
    public void testUnitNumber10105(){
        int num = 10105;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand, One hundred and Five");
    }

    @Test
    public void testUnitNumber10117(){
        int num = 10117;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand, One hundred and Seventeen");
    }

    @Test
    public void testUnitNumber10143(){
        int num = 10143;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand, One hundred and Forty Three");
    }

    @Test
    public void testUnitNumber10500(){
        int num = 10500;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand and Five hundred");
    }

    @Test
    public void testUnitNumber10848(){
        int num = 10848;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Ten thousand, Eight hundred and Forty Eight");
    }

    @Test
    public void testUnitNumber12672(){
        int num = 12672;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Twelve thousand, Six hundred and Seventy Two");
    }

    @Test
    public void testUnitNumber19752(){
        int num = 19752;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Nineteen thousand, Seven hundred and Fifty Two");
    }

    @Test
    public void testUnitNumber24672(){
        int num = 24672;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Twenty Four thousand, Six hundred and Seventy Two");
    }

    @Test
    public void testUnitNumber124672(){
        int num = 124672;
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"One lakh, Twenty Four thousand, Six hundred and Seventy Two");
    }

    @Test
    public void testUnitString124672(){
        String num = "1,24,672";
        String word = numericConverter.convertToWords(num,",");
        Assert.assertEquals(word,"One lakh, Twenty Four thousand, Six hundred and Seventy Two");
    }

    @Test
    public void testUnitString4000000(){
        String num = "40,00,000";
        String word = numericConverter.convertToWords(num,",");
        Assert.assertEquals(word,"Forty lakh");
    }

    @Test
    public void testUnitString1855309(){
        String num = "18,55,309";
        String word = numericConverter.convertToWords(num,",");
        Assert.assertEquals(word,"Eighteen lakh, Fifty Five thousand, Three hundred and Nine");
    }

    @Test
    public void testUnitString24672(){
        String num = "24672";
        String word = numericConverter.convertToWords(num);
        Assert.assertEquals(word,"Twenty Four thousand, Six hundred and Seventy Two");
    }
}
