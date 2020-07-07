package org.example.numeric.words.model;

public class TripleDigit extends BaseDigit{

    public TripleDigit(int value, int placeValue, BaseDigit digit) {
        super(value,placeValue,digit);
    }

    @Override
    public String generateWordForValue() {
        String word = "";
        if(this.getValue() != 0){
            word += singularArray[this.getValue()] + BaseDigit.WHITE_SPACE + suffixArray[this.placeValue];
            word += this.getDigit().generateWordForValue().equals("")?"":BaseDigit.AND + this.getDigit().generateWordForValue();
        }else{
            word += this.getDigit().generateWordForValue().equals("")?"":this.getDigit().generateWordForValue();
        }
        return word.trim();
    }


    /*
    @Override
    public String generateWordForValue() {
        String word = "";
        boolean isTrailingNumberAllZeroes = NumericWordUtils.checkTrailingZero(this.getDigit());
        String chainedValue = this.getDigit().generateWordForValue();
        int placeValue = this.placeValue;
        //check if trailing digits are zero
        //then skip and just print value + Suffix
        //use "and" only if

        //TODO
        //if place value > 4 and is odd number eg 5,7,9
        //combine the next digit and evaluate
        if(placeValue > 4 && placeValue%2 != 0){
            //get the next digit
            SingleDigit tempSingleDigit = new SingleDigit(this.getDigit().getValue());
            DoubleDigit tempDoubleDigit = new DoubleDigit(this.getValue(),tempSingleDigit);
            word = tempDoubleDigit.generateWordForValue();
            BaseDigit grandChild = this.getDigit()!= null ? this.getDigit().getDigit():null;
            if(grandChild != null){
                this.digit = grandChild;
            }
        }


        if(isTrailingNumberAllZeroes){
            word += " " + wordArray[value] +" "+ this.suffixArray[placeValue];
            return word.trim();
        }

        String separator = " and ";
        if(placeValue > 3 && this.getDigit().getValue() > 0){
            separator = ", ";
        }

        if(!chainedValue.contains("and")){
            separator = " and ";
        }

        String currentValue = (this.value > 0) ? wordArray[value] + " " + this.suffixArray[placeValue] + separator :"";

        word = currentValue + chainedValue;
        return word.trim();
    }
    */

}
