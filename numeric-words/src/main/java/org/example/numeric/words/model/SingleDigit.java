package org.example.numeric.words.model;

public class SingleDigit extends BaseDigit{

    public SingleDigit(int value, int placeValue) {
        super(value,placeValue);
    }

    @Override
    public String generateWordForValue() {
        if(this.value == 0){
            return "Zero";
        }
        return singularArray[this.value];
    }
}
