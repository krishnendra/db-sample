package org.example.numeric.words.model;

public abstract class BaseDigit implements Digit {

    static String WHITE_SPACE = " ";
    static String AND = " and ";
    static String COMMA = ", ";

    protected BaseDigit digit;
    protected int placeValue;
    protected int value;

    protected String[] suffixArray = {"","","","hundred","thousand","","lakh","","crore","","","arab","","kharab",""};
    protected String[] decArray = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    protected String[] teenArray = {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    protected String[] singularArray = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public BaseDigit(int value,int placeValue){
        this.value = value;
        this.placeValue = placeValue;
    }



    public BaseDigit(int value,int placeValue, BaseDigit digit){
        this.value = value;
        this.placeValue = placeValue;
        this.digit = digit;
    }

    public int getValue() {
        return value;
    }

    public BaseDigit getDigit() {
        return digit;
    }

}
