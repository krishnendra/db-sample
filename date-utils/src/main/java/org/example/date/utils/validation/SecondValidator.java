package org.example.date.utils.validation;

import org.example.date.utils.model.DateTime;

public class SecondValidator extends Validator {

    @Override
    public boolean isValid(DateTime dateTime) {
        if(dateTime.getTime().getSecond() > 59){
            return false;
        }

        if(dateTime.getTime().getSecond() < 0){
            return false;
        }
        
        return true;
    }
}
