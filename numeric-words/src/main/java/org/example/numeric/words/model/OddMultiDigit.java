package org.example.numeric.words.model;

public class OddMultiDigit extends DoubleDigit {

    private int placeValue;

    public OddMultiDigit(int value, int placeValue , BaseDigit digit) {
        super(value,placeValue,digit);
        this.placeValue = placeValue;
    }

    @Override
    public String generateWordForValue() {

        String word = "";
        if(this.getValue() != 0){
            if(this.getValue() > 1){
                word = super.generateWordForValue() ;
            }else{
                if(this.getDigit().getValue() != 0){
                    word = teenArray[this.getDigit().getValue()] + BaseDigit.WHITE_SPACE + suffixArray[this.placeValue-1];
                }else{
                    word = decArray[this.getValue()] + BaseDigit.WHITE_SPACE + suffixArray[this.placeValue-1];
                }

                BaseDigit grandChild = this.getDigit().getDigit();
                this.digit = grandChild;

                if(!this.getDigit().generateWordForValue().equals("")){
                    if(this.getDigit().generateWordForValue().contains("and")){
                        word += BaseDigit.COMMA + this.getDigit().generateWordForValue();
                    }else{
                        word += BaseDigit.AND + this.getDigit().generateWordForValue();
                    }
                }else{
                    word += "";
                }
            }
        }

        return word.trim();
    }
}
