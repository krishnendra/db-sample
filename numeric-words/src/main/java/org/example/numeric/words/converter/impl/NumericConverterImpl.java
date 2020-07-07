package org.example.numeric.words.converter.impl;

import org.example.numeric.words.converter.NumericConverter;
import org.example.numeric.words.model.*;

public class NumericConverterImpl implements NumericConverter {

    @Override
    public String convertToWords(int number) {
        return convertToWords(new Long(number));
    }

    @Override
    public String convertToWords(String number) {
        return convertToWords(new Long(number));
    }

    @Override
    public String convertToWords(String number, String delimiter) {
        String strippedValue = number.replaceAll(delimiter,"");
        return convertToWords(strippedValue);
    }

    @Override
    public String convertToWords(long number) {
        String word = "";
        long mutableNumber = number;
        int counter = 1;
        BaseDigit digit = null;
        if(mutableNumber == 0){
            digit = new SingleDigit(Long.valueOf(mutableNumber).intValue(),counter);
        }else{
            while(mutableNumber > 0){
                long digitValue = mutableNumber % 10;
                int faceValue = Long.valueOf(digitValue).intValue();
                if(counter == 1){
                    digit = new SingleDigit(faceValue,counter);
                }else if(counter == 2){
                    digit  = new DoubleDigit(faceValue,counter, digit);
                }else if(counter == 3){
                    digit  = new TripleDigit(faceValue, counter ,digit );
                }else if(counter > 3 && counter %2 == 0){
                    digit  = new EvenMultiDigit(faceValue, counter,digit);
                }else{
                    digit  = new OddMultiDigit(faceValue, counter,digit);
                }
                counter++;
                mutableNumber = mutableNumber / 10;
            }
        }

        word = digit.generateWordForValue();
        return word;
    }
}
