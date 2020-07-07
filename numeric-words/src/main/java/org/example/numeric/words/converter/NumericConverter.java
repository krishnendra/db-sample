package org.example.numeric.words.converter;

public interface NumericConverter {

    String convertToWords(int number);

    String convertToWords(long number);

    String convertToWords(String number);

    String convertToWords(String number,String delimiter);
}
