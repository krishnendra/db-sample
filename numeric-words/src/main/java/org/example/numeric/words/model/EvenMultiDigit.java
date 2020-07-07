package org.example.numeric.words.model;

public class EvenMultiDigit extends BaseDigit{
    private int placeValue;

    public EvenMultiDigit(int value,int placeValue,BaseDigit digit) {
        super(value,placeValue,digit);
        this.placeValue = placeValue;
    }

    @Override
    public String generateWordForValue() {
        //logic for unit thousand eg . One thousand, Two lakh , Five Crore
        String word = "";
        if(this.getValue() != 0){
            word += singularArray[this.getValue()] + BaseDigit.WHITE_SPACE + suffixArray[this.placeValue];

            if(!this.getDigit().generateWordForValue().equals("")){
                if(this.getDigit().generateWordForValue().contains("and")){
                    word += BaseDigit.COMMA + this.getDigit().generateWordForValue();
                }else{
                    word += BaseDigit.AND + this.getDigit().generateWordForValue();
                }
            }else{
                word += "";
            }
        }else{
            word += this.getDigit().generateWordForValue().equals("")?"":this.getDigit().generateWordForValue();
        }
        return word;
    }
}
