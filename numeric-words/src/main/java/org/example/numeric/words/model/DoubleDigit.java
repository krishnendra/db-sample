package org.example.numeric.words.model;

public class DoubleDigit extends BaseDigit{

    public DoubleDigit(int value,int placeValue, BaseDigit digit) {
        super(value,placeValue,digit);
    }

    @Override
    public String generateWordForValue() {
        /*
        if 0 then dont change anything use the underlying generated word
        if 1 then check if unit is 0
            if 0 then its special case
            if 1 -9 then special words
        if 2 then
            unit is 0 then special case
            else append to unit
         */
        String word = this.getDigit().generateWordForValue();
        int unitValue = this.getDigit().getValue();
        if(unitValue == 0){
            //special case
            if(this.placeValue > 2){
                word = decArray[value] + BaseDigit.WHITE_SPACE + suffixArray[this.placeValue-1];
            }else{
                word = decArray[value];
            }
        }else{
            if(this.value == 1){
                //Teen data
                word = teenArray[unitValue];
            }else{
                //append word
                word = decArray[value] +BaseDigit.WHITE_SPACE + word;
            }
        }

        return word.trim();
    }
}
